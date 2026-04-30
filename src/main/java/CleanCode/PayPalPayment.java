package CleanCode;

public class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
<<<<<<< HEAD
        System.out.println("Оплата через PayPal на сумму  + amount");
=======
        System.out.println("Оплата через PayPal на сумму " + amount);
>>>>>>> 5829d82a4f3c64130eea2c0ca6c118ac466518e6
    }
}
