package StrTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Cat");
        list.add("Programming");
        list.add("Hi");

        list.sort(Comparator.comparing(String::length));

        System.out.println(list);

    }

}
