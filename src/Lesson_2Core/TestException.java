package Lesson_2Core;

public class TestException {
    int size = 4;

    //проверка длины массива.
    public void testSize(String[][] array) throws MyArraySizeException {
        if (array.length != size) throw new MyArraySizeException("В длине массива ошибка.");
    }

    //Заменить String на int и просуммировать.
    public int getSum(String[][] array) throws MyArrayDataException {
        int arrSum = 0;
        int i = 0;
        int j = 0;

        try {
            for (; i < array.length; i++) {
                for (; j < array[0].length; j++) {
                    arrSum = arrSum + Integer.parseInt(array[i][j]);
                }
            }
            System.out.println("Сумма изменённого массива = " + arrSum);
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Ошибка в массиве : " + (" " + i) + (" " + j));
        }
        return arrSum;
    }
}
