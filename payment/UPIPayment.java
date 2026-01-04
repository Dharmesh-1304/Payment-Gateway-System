package payment;

public class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using UPI");
    }
}
