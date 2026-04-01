package StrTasks;

public class CountWords {
    public static int wordsCount(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;

    }

    // public int countWords(String str) {
    //    return (int) Arrays.stream(str.trim().split("\\s+"))
    //        .filter(s -> !s.isEmpty())
    //        .count();
    //}

    public static void main(String[] args) {
        System.out.println(wordsCount("Khava"));
    }
}
