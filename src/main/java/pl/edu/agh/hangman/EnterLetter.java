package pl.edu.agh.hangman;

import java.util.Scanner;

public class EnterLetter {
    private static int count = 0;

    public String enterLetter() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess any letter in the word");
        String letter = scan.next();
        if (letter.length()>1){
         throw new IllegalArgumentException("You have to enter single letter");
        }
        return letter;
    }

    public static void main(String[] args) {
        EnterLetter s = new EnterLetter();
        String letter = s.enterLetter();
    }
}

