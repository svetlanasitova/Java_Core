package Lesson_5Core;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileCSV = new File("src/TestInfo/test.csv");
        File file1CSV = new File("src/TestInfo/tes1.csv");
        //этот фаил написала для себя чтобы проверить реализацию reader

        System.out.println(fileCSV.exists());
        System.out.println(file1CSV.exists());

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/TestInfo/test.csv"))){
            String fileContent = "Have a nice day.";
            bufferedWriter.write(fileContent);
            System.out.println(fileContent);
        }catch (IOException e){

        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/TestInfo/test1.csv"))){
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
        }catch (IOException e){

        }
    }
}
