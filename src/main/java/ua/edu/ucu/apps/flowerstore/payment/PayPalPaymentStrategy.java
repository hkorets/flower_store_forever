package ua.edu.ucu.apps.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment {
    private String description;

    public PayPalPaymentStrategy() {
        description = "CreditCard Payment";
    }

    public void pay(double price) {
        System.out.println("Payed with paypal " + price);
    }
}
