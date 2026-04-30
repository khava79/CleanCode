package CleanCode;
//Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.

abstract class Bird {
<<<<<<< HEAD
    private String name;
=======
    private final String name;
>>>>>>> 5829d82a4f3c64130eea2c0ca6c118ac466518e6

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Птица издаёт звуки");
    }
}

