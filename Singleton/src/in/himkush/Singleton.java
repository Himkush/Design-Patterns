package in.himkush;

import java.util.LinkedList;

public class Singleton {
    private static Singleton firstInstance = null;

    private Singleton() {

    }

    //Hold all my Scrabble letters in Array
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<>();

    static boolean firstthread = true;


    public static Singleton getInstance() {
        if (firstInstance == null) {
            if (firstthread) {
                firstthread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                firstInstance = new Singleton();

            }
        }
        return firstInstance;

    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }
    public LinkedList<String> getTiles(int howManyTiles){
        LinkedList<String> tilesToSend = new LinkedList<>();
        for(int i =0;i<=howManyTiles;i++){
            tilesToSend.afir

        }
    }

}

