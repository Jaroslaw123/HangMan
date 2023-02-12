package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Random;

public class RandomWord {
    public String getRandomWord(ArrayList<String> wordList){
        Random rand = new Random();
        int range = wordList.size() - 1;
        int pos = rand.nextInt(range);
        return wordList.get(pos);
    }
}
