package controller;

import model.Transaction;
import payment.Payment;
import repository.TransactionRepository;
import service.PaymentService;

public class PaymentController {

    private PaymentService service;

    public PaymentController(Payment payment, TransactionRepository repository) {
        this.service = new PaymentService(payment, repository);
    }

    public Transaction pay(double amount) {
        return service.makePayment(amount);
    }
}
