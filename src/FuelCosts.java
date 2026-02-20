import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double milesGallon = 0;
        double price = 0;
        double cost = 0;
        double mileage = 0;
        boolean good = false;
        String trash = "";

        do {
            System.out.print("\nHow many gallons of gas can your car hold?: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                good = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid variable. Please write a numerical value, not " + trash);
            }
        } while (!good);

        good = false;

        do {
            System.out.print("\nHow many miles do you get per gallon of gas?: ");
            if (in.hasNextDouble())
            {
                milesGallon = in.nextDouble();
                in.nextLine();
                good = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid variable. Please write a numerical value, not " + trash);
            }
        }while (!good);

        good = false;

        do {
            System.out.print("\nWhat is the cost of your gas per gallon?: ");
            if (in.hasNextDouble())
            {
                price = in.nextDouble();
                in.nextLine();
                good = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid variable. Please write a numerical value, not " + trash);
            }
        }while (!good);

        cost = (100 / milesGallon) * price;
        System.out.println("\nThe cost for you to drive 100 miles is " + cost + " dollars.");

        mileage = gallons * milesGallon;
        System.out.println("\nThe total amount you can go with a full tank is " + mileage + " miles.");


    }
}