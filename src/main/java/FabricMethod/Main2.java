package FabricMethod;

public class Main2 {
    public static void main(String[] args) {
        Weapon bow = new BowFactory().createWeapon();
        bow.attack();

        Weapon gun = new GunFactory().createWeapon();
        gun.attack();

        Weapon sword = new SwordFactory().createWeapon();
        sword.attack();


    }
}
