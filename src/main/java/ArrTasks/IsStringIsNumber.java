package ArrTasks;

public class IsStringIsNumber {
    public static boolean isNumber(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        s = s.trim();

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNumber("435asd"));
        System.out.println(isNumber("2313"));
        System.out.println(isNumber(""));
        System.out.println(isNumber("null"));
        System.out.println(isNumber(" 345 "));
    }

}
