package Builder;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder addItem(String item, double price) {
        order.addItem(item, price);
        return this;
    }

    public OrderBuilder applyDiscount(double discount) {
        order.setDiscount(discount);
        return this;
    }

    public OrderBuilder setPaymentMethod(String method) {
        order.setPaymentMethod(method);
        return this;
    }

    public Order build() {
        return order;
    }
}
