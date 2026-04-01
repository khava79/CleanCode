package ArrTasks;

public class IsEven {
    public static boolean isNumberEven(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным или равняться 0");
        }
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isNumberEven(2));
        System.out.println(isNumberEven(5));

        try {
            System.out.println(isNumberEven(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage()); }

        try {
            System.out.println(isNumberEven(0));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}