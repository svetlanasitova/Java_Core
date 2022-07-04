package Lesson_4Core;

import java.util.*;
import java.util.HashMap;
import java.lang.String;

public class Phonebook {
    private HashMap<String, List<String>> book;
    public Phonebook(){
        this.book = new HashMap<>();
    }
    public void addBook(String number, String surname){
        if(book.containsKey(surname)){
       List<String>numbers = book.get(surname);
            if(!numbers.contains(number)){
               numbers.add(number);
                System.out.println("Добавлен номер "+number+
                        "  с фамилией " +surname );
            }else{
                System.out.println("Номер "+ number+" уже" +
                        " существует с такой фамилией " +surname);
            }
        }else{
            List<String> put;
            put = book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Добавлен номер " +number+" с фамилией " + surname);
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        }else{
            System.out.println("В справочнике нет фамилии " +surname+
                    " телефона  .");
            return new ArrayList<>();
        }
    }

}
