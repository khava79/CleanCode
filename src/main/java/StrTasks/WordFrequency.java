package StrTasks;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    Map<String, Integer> wordFreq(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть null");
        }

        Map<String, Integer> map = new HashMap<>();
        s = s.toLowerCase().replaceAll("[^a-zа-яё\\s]", "");
        for (String word : s.split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        } return map;
    }
}
