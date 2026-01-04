package repository;

import model.Transaction;

public interface TransactionRepository {
    void save(Transaction transaction);
    Transaction findById(String transactionId);
}
