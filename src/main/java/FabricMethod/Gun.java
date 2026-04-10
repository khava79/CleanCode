package FabricMethod;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Человек аттакует пистолетом");
    }

}