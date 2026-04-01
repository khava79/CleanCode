package StrTasks;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    List<Integer> filterOdds(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }
        return list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }
}
