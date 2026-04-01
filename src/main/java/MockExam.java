// массив строк и нужно собрать предложение
// [мама мыла раму]
// мама мыла раму.
// больше 5 слов - ошибка


public class MockExam {
    public static String joinStrings(String[] words) {
        if (words.length >= 5) {
            throw new IllegalArgumentException("В списке не должно быть больше 5 слов");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) sb.append(" ");


        }
        return sb.append(".").toString();
    }

    public static void main(String[] args) {
        String[] words = {"мама", "мыла", "раму"};
        System.out.println(joinStrings(words));

        String[] words2 = {"мама", "мыла", "раму", "в", "семь", "часов"};
        System.out.println(joinStrings(words2));
    }

}
