package ArrTasks;

public class FactorialTask {
    public static long factorial (int number) {
        if (number < 0) { // обработка отрицательных чисел
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        if (number == 0 || number == 1) { // обработка 0 и 1 
            return 1; // 0! = 1 и 1! = 1
        }
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(-1));
    }
}
