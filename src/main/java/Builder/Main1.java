package Builder;

public class Main1 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order1 = shop.createStandardOrder();
        System.out.println(order1);

        Order order2 = shop.createPremiumOrder();
        System.out.println(order2);


    }

}
