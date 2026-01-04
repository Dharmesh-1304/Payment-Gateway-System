package payment;

public class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Credit Card");
    }
}
