package Task2;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("PayPal Payment - Processed");
    }
}
