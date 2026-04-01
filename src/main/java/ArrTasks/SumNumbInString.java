package ArrTasks;

public class SumNumbInString {
    public static int sumNumbers(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }
        if (str.isEmpty()) {
            return 0;
        }

        int sum = 0, num = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num *  10 +(c - '0');
            } else {
                sum += num;
                num = 0;
            }

        } return sum + num;


    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("ab12cd3ef45"));
        System.out.println(sumNumbers("abc"));
        System.out.println(sumNumbers("123"));
        System.out.println(sumNumbers("a1b2c3"));
        System.out.println(sumNumbers("abc123"));
        System.out.println(sumNumbers(""));

        try {
            System.out.println(sumNumbers(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
