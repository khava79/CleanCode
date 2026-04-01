package StrTasks;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    List<String> filter(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("Список не может быть null");
        }
        return list.stream()
                .filter(s -> s != null && s.startsWith("A"))
                .collect(Collectors.toList());
    }
}
