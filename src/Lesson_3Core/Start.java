package Lesson_3Core;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        Box<Apple> ap2 = new Box<>();
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Orange> or2 = new Box<>();

        System.out.println("Добавим : ");
        ap.addFruit(new Apple(1.5f), 10);
        ap1.addFruit(new Apple(1.5f),6);
        ap2.addFruit(new Apple(1.5f), 12);
        or.addFruit(new Orange(1.0f),12);
        or1.addFruit(new Orange(1.0f), 5);
        or2.addFruit(new Orange(1.0f),8);
        System.out.println("Коробка яблок 1: " + ap.getWeightBox());
        System.out.println("Коробка яблок 2: " + ap1.getWeightBox());
        System.out.println("Коробка яблок 3: " + ap2.getWeightBox());
        System.out.println("Коробка апельсин 1: " + or.getWeightBox());
        System.out.println("Коробка апельсин 2: " + or1.getWeightBox());
        System.out.println("Коробка апельсин 3: " + or2.getWeightBox());

        System.out.println();
        System.out.println("Сравним коробку яблок 1 c коробкой апельсин 2 : " + ap.compare(or1));
        System.out.println("Сравним коробку яблок 2 c коробкой апельсин 1 : " + ap1.compare(or));
        System.out.println("Сравним коробку яблок 3 с коробкой яблок 2" + ap2.compare(ap1) );
        System.out.println("Вес коробки = "+ ap.getWeightBox());
        System.out.println("Вес коробки = "+ ap1.getWeightBox());
        System.out.println("Вес коробки = "+ or.getWeightBox());
        System.out.println("Вес коробки = "+ or1.getWeightBox());

      /*  public class SwapArray<T> {
            T tmp;
            public  void swap(T[] array, int n1, int n2) {
                tmp = arr[n1];
                arr[n1] = arr[n2];
                arr[n2] = tmp;
                System.out.println("Результат пересыпания : " + Arrays.toString(arr) + "\n");
            }  этот метод меняет местами элементы в массиве, неперемещает из одного массива в другой
      */  }
}
