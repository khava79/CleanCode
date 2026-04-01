package ArrTasks;

public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n <= 0) {
            return false;}

        if (n % 10 == 0) {
            return false;
        }
        int rev = 0, original = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        } return original == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));


    }
}
