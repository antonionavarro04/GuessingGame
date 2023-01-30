package guessinggame;

public class Game {
    private static int numberToBeGuessed;

    private static double maxNumber;
    private static double minNumber;

    public static void configurateNumbers() {
        System.out.println("Introduce the range of generating numbers:");
        System.out.print("Maximum Number: ");
        minNumber = Scan.read.nextDouble();
        System.out.print("Minimum Number: ");
        maxNumber = Scan.read.nextDouble();
    }

    public static void generateNumber() {
        numberToBeGuessed = (int) (Math.random() * (maxNumber - minNumber) + (minNumber + 0.5d));
    }

    public static int getNumber() {
        return numberToBeGuessed;
    }
}
