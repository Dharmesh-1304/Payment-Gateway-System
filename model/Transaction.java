package model;

import java.util.UUID;

public class Transaction {

    private String transactionId;
    private double amount;
    private TransactionStatus status;

    public Transaction(double amount) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
        this.status = TransactionStatus.FAILED;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}
