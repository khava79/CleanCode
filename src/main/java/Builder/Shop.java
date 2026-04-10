package Builder;

public class Shop {
    public Order createStandardOrder() {
        return new OrderBuilder()
                .addItem("Phone", 500)
                .addItem("Headphones", 100)
                .applyDiscount(5)
                .setPaymentMethod("PayPal")
                .build();
    }

    public Order createPremiumOrder() {
        return new OrderBuilder()
                .addItem("Laptop", 1500)
                .addItem("TV", 700)
                .applyDiscount(15)
                .setPaymentMethod("Credit Card")
                .build();
    }
}
