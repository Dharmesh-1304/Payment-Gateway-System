package service;

import model.Transaction;
import payment.Payment;
import processor.PaymentProcessor;
import repository.TransactionRepository;
import observer.EmailNotification;
import observer.SMSNotification;

public class PaymentService {

    private PaymentProcessor processor;
    private TransactionRepository repository;

    public PaymentService(Payment payment, TransactionRepository repository) {
        this.processor = new PaymentProcessor(payment);
        this.repository = repository;

        processor.addObserver(new EmailNotification());
        processor.addObserver(new SMSNotification());
    }

    public Transaction makePayment(double amount) {
        Transaction transaction = processor.process(amount);
        repository.save(transaction);
        return transaction;
    }
}
