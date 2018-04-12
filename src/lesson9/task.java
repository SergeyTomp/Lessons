package lesson9;


//для каждой строки
//        File txt = new File("./src/lesson9/testFile");
//                List lines = Files.readAllLines(txt.toPath());
//перервести внижний регистр
//убрать пробеля в начале и конце
// поместить в коллекцию непустые слова

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class task {


    public static void main(String[] args) throws IOException {
        File txt = new File("src/lesson9/testFile");
        List <String> lines = Files.readAllLines(txt.toPath());
        ArrayList <String> strings = new ArrayList<>();

        for (String str: lines){
            String [] cleanRubbish = str.toLowerCase().replaceAll("\\p{Punct}","").trim().split("\\s+");
            for (int i = 0; i < cleanRubbish.length; i++){
                strings.add(cleanRubbish[i]);
            }
        }
        System.out.println(strings);


    }
}