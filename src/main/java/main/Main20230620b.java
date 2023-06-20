package skoleni;

import pk.*;


public class Main20230620b {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Bird bird=new Bird();
        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();

        PaymentMethod crediCard=new CreditCard();
        PaymentMethod paypal=new PayPal();
        PaymentMethod cash=new Cash();
        crediCard.processPayment(10);
        paypal.processPayment(20);
        cash.processPayment(30);


    }
}
