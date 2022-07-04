package Lesson_4Core;

import java.lang.*;

public class Test {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addBook("111222", "Petrov");
        phonebook.addBook("222333","Ivanov");
        phonebook.addBook("333444","Sidorov");
        phonebook.addBook("444555","Levin");
        phonebook.addBook("555666","Lobanov");
        phonebook.addBook("666777","Ivanov");
        phonebook.addBook("777888", "Kuzy");
        phonebook.addBook("888999","Kupitman");

        System.out.println("=========================");

        System.out.println("Находим телефон : ");
        System.out.println(phonebook.get("Lobanov"));
        System.out.println();
        System.out.println("Вывод телефонов однофамильцев ");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println();
        System.out.println("Пробуем записать уже существующий");
        phonebook.addBook("555666", "Lobanov");
        System.out.println(phonebook.get("Lobanov"));
        System.out.println();
        System.out.println("Проверяем не существующий номер :");
        System.out.println(phonebook.get("Shitova"));

    }
}
