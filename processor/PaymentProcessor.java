package processor;

import payment.Payment;
import validator.PaymentValidator;
import model.Transaction;
import model.TransactionStatus;
import observer.PaymentObserver;
import logger.PaymentLogger;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    private Payment payment;
    private List<PaymentObserver> observers = new ArrayList<>();
    private static final int MAX_RETRIES = 3;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void addObserver(PaymentObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Transaction transaction) {
        for (PaymentObserver observer : observers) {
            observer.update(transaction);
        }
    }

    public synchronized Transaction process(double amount) {

        PaymentValidator.validateAmount(amount);
        Transaction transaction = new Transaction(amount);

        int attempts = 0;

        while (attempts < MAX_RETRIES) {
            try {
                attempts++;
                PaymentLogger.log("Attempt " + attempts);
                payment.pay(amount);
                transaction.setStatus(TransactionStatus.SUCCESS);
                notifyObservers(transaction);
                return transaction;
            } catch (Exception e) {
                PaymentLogger.log("Retry failed");
            }
        }

        transaction.setStatus(TransactionStatus.FAILED);
        notifyObservers(transaction);
        return transaction;
    }
}
