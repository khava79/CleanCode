package ArrTasks;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // обработка отрицательных чисел

        for (int i = 2; i * i <= number; i++) { // обработка простых чисел
            if (number % i == 0) return false; // обработка 0

        }
        return true;
    }

    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 0;
        int number3 = 1;
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));

    }
}
