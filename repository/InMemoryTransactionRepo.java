package repository;

import model.Transaction;
import java.util.HashMap;
import java.util.Map;

public class InMemoryTransactionRepo implements TransactionRepository {

    private Map<String, Transaction> db = new HashMap<>();

    public void save(Transaction transaction) {
        db.put(transaction.getTransactionId(), transaction);
    }

    public Transaction findById(String id) {
        return db.get(id);
    }
}
