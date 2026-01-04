package factory;

import payment.*;

public class PaymentFactory {

    public static Payment getPayment(PaymentType type) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCardPayment();
            case UPI:
                return new UPIPayment();
            case NET_BANKING:
                return new NetBankingPayment();
            default:
                throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}
