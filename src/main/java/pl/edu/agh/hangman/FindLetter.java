package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
class FindLetter {
    public ArrayList<Integer> findLetter(String letter, String word) {
        int i = 0;
        int firstIndex = word.indexOf(letter, i);
//            System.out.println("First occurrence of char 's'"
//                    + " is found at : "
//                    + firstIndex);
        ArrayList<Integer> listt = new ArrayList<Integer>();
        if (firstIndex == -1) {
            listt.add(firstIndex);
            return listt;
        } else {
            for (i = 1; i <= word.length(); i++) {
                listt.add(word.indexOf(letter, i));
            }
            return listt;
        }
    }
}