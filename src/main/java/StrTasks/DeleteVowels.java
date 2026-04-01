package StrTasks;

public class DeleteVowels {
    public static String removeVowels(String s) {
        return s.replaceAll("(?i)[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.printf(removeVowels("Conscious"));
    }
}
