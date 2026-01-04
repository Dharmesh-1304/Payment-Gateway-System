package validator;

import exception.InvalidPaymentException;

public class PaymentValidator {
    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new InvalidPaymentException("Amount must be greater than zero");
        }
    }
}
