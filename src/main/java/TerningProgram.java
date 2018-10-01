import java.util.Scanner;

public class TerningProgram {
    public static void main(String[] args) { //Den her kommentar fikser alle bugs i hele systemet, det virkelig nice
        Dice cup = new Dice();   // Make an instance of Dice
        Scanner keyboard=new Scanner(System.in);   // Make an instance of keyboard Scanner
        System.out.println("Welcome to the diceroll program");
        System.out.println("How many times do you want to roll the dice?");
        int n = keyboard.nextInt();  // Read integer
        cup.rollMultiple(n);         // Roll the dice n times
        keyboard.close();            // Close the scanner
    }
}
//Hans var her