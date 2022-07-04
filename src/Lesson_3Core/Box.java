package Lesson_3Core;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    T[] fruitArrayList;
    private ArrayList<T> box = new ArrayList<>();

    public Float getWeightBox() {
        Float result = 0.0f;
        for (T t : box) {
            if (t != null) {
                result += t.getWeight();
            }
        }
        return result;
    }
    public boolean compare (Box anohterBox){
        if(getWeightBox() == anohterBox.getWeightBox())return true;
        return false;
    }
    public void addFruit(T fruit, int amount){
        for(int i = 0; i < amount; i++) box.add(fruit);
    }
}
