package pk;

public class CreditCard implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("credi card:"+amount);
    }
}
