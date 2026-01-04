package payment;

public class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using Net Banking");
    }
}
