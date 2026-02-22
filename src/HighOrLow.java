import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Random gen = new Random();
    int choice = gen.nextInt(10) + 1;
    int guess = 0;
    String trash = "";
    boolean guessed = false;

    do{
        System.out.print("I have chosen a random number 1-10. What is your guess?: ");
        if (in.hasNextInt())
        {
           guess = in.nextInt();
           in.nextLine();
           if (guess >= 1 && guess <= 10)
            {
                guessed = true;
            }
            else
            {
                System.out.println("You must enter a valid number [1-10], not " + guess);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a numerical value, not " + trash + " \n");
        }
    }while (!guessed);

        System.out.println("\nThe secret number was " + choice);
        if (guess > choice)
        {
            System.out.println("\nYour guess was HIGHER");
        }
        else if (guess < choice)
        {
            System.out.println("\nYour guess was LOWER");
        }
        else
        {
            System.out.println("\nYour guess was right on the MONEY!");
        }

    }
}
