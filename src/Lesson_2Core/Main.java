package Lesson_2Core;

public class Main {
    public static void main(String[] args) throws MyArrayDataException,MyArraySizeException{
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arr2 = {{"I", "want"}, {"be", "friend"}};
        String[][]arr3 = {{"1", "2", "3", " "},{"5", "6", "7", "8"},{"9", "&", "11", "12"},{"13", "14", "15", "16"}};

        TestException testException = new TestException();
        testException.testSize(arr);
        testException.getSum(arr);
        try {
            testException.testSize(arr2);
        } catch (MyArraySizeException e) {
            throw new RuntimeException(e);
        }
        try {
            testException.testSize(arr3);
        } catch (MyArraySizeException e) {
            throw new RuntimeException(e);
        }

        try {
            testException.getSum(arr);
            //
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            testException.getSum(arr2);
            //
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            testException.getSum(arr3);
            //
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
