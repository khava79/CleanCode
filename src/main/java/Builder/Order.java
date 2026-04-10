package Builder;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private double totalPrice;
    private double discount;
    private String paymentMethod;

    public Order() {
        this.items = new ArrayList<>();
        this.totalPrice = 0;
        this.discount = 0;

    }

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getFinalPrice() {
        return totalPrice - (totalPrice * discount / 100);
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
