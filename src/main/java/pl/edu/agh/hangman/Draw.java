package pl.edu.agh.hangman;
import java.util.ArrayList;
import static pl.edu.agh.hangman.Hangman.HANGMANPICS;
public class Draw {
    public void drawGallow(int stage, String[] hpic) {
        System.out.println(hpic[stage]);
    }
    public void drawLetter(ArrayList<Integer> indexLetter, String letter) {
        ArrayList<String> finalWord = new ArrayList<>();
        for(int i = 0; i < letter.length(); i++){
            finalWord.add("_ ");
        }
        for(int j = 0; j < indexLetter.size(); j++){
            finalWord.set(indexLetter.get(j),letter.substring(indexLetter.get(j),indexLetter.get(j) + 1));
        }
        for (String ll : finalWord) {
            System.out.print(ll);
        }
    }
}
