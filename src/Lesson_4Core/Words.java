package Lesson_4Core;

import java.util.*;
public class Words {
    private static Collections collections;

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "One", "Two", "Three", "Four",
                "Один", "Два", "Три", "Четыре",
                "Three", "Два", "Пять", "Nine",
                "Ten", "Пять", "One", "Out");
        Set<String> unique = new HashSet<>(words);

        System.out.println("Данн массив : ");
        System.out.println(words.toString());
        System.out.println("Уникальные слова : " + unique.toString());
        System.out.println("Сколько повторений : ");
        for (String key : unique){
            System.out.println(key + " = " + collections.frequency(words, key));
        }
    }
}
