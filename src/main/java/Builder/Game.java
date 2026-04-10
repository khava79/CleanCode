package Builder;

public class Game {
    public Character createWarrior() {
        return new CharacterBuilder()
                .setHealth(100)
                .setDamage(10)
                .setArmor(100)
                .setMagic(20)
                .build();
    }

    public Character createMage() {
        return new CharacterBuilder()
                .setHealth(90)
                .setDamage(20)
                .setArmor(90)
                .setMagic(15)
                .build();
    }
}
