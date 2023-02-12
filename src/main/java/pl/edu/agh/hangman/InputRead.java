package pl.edu.agh.hangman;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class InputRead {
    private ArrayList<String> inputRead(){
        File file = new File("/home/jarek/Studia/MWO/Techniki_programowania_w_Javie_2/HangMan_clone/java-hangman/src/main/resources/slowa.txt");
        ArrayList<String> wordList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                wordList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return wordList;
    }
}
