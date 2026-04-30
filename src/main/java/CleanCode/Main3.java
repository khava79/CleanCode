package CleanCode;

public class Main3 {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Пингвин");
        Bird sparrow = new Sparrow("Воробей");

        penguin.makeSound();
        sparrow.makeSound();

<<<<<<< HEAD
        if (sparrow instanceof Flyable) {
            ((Flyable) sparrow).fly();
        }
        if (penguin instanceof Flyable) {
            ((Flyable) penguin).fly();
        }
=======
       
>>>>>>> 5829d82a4f3c64130eea2c0ca6c118ac466518e6
    }
}
