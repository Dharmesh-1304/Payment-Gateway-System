package main;

import controller.PaymentController;
import factory.PaymentFactory;
import payment.Payment;
import payment.PaymentType;
import repository.InMemoryTransactionRepo;
import repository.TransactionRepository;
import model.Transaction;

public class Main {

    public static void main(String[] args) {

        Payment payment = PaymentFactory.getPayment(PaymentType.UPI);
        TransactionRepository repository = new InMemoryTransactionRepo();

        PaymentController controller =
                new PaymentController(payment, repository);

        Transaction transaction = controller.pay(2500);

        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Final Status: " + transaction.getStatus());
    }
}
