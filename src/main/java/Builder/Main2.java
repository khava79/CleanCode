package Builder;

public class Main2 {
    public static void main(String[] args) {
        Game game = new Game();

        Character warrior = game.createWarrior();
        Character mage = game.createMage();

        System.out.println(warrior);
        System.out.println(mage);

    }
}
