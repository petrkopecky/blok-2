package pk;

public class PayPal implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal:"+amount);
    }
}
