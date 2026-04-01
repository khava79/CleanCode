package ArrTasks;

public class Scobki {
    public static boolean isBalanced(String s) {

        if (s == null) {
            throw new IllegalArgumentException("Строка не должна быть null");
        }

        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else if (c == ')') balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(()())"));
        System.out.println(isBalanced("(()(()("));

    }
}
