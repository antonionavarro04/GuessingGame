package guessinggame;

// ? Import of Swing
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int guessTable[][] = new int[1][2];

        Game.configurateNumbers();
        
        int guess;
        
        do {
            Game.generateNumber();
            System.out.println(Game.getNumber());
            int guesses = 0;
            do {
                System.out.print(">>> ");
                guess = Scan.read.nextInt();
                guesses++;

                if (guess < 0) {
                    break;
                }
            } while (Game.getNumber() != guess);

            //JOptionPane.showMessageDialog(null, "" + "Congratulations, you guessed the number " + Game.getNumber() + " in " + guesses + " guesses!", "Guessing Game", 3, null);

            if (guess >= 0) {
                guessTable = ArrayManager.extendArrayVertical(guessTable);

                guessTable[guessTable.length - 1][0] = guess;
                guessTable[guessTable.length - 1][1] = guesses;
            }
        } while (guess >= 0);

        ArrayManager.printArray(guessTable);
    }
}
