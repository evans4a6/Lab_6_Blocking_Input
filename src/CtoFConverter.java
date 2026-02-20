import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";
        boolean valid = false;

        do
        {
            System.out.print("What is your temperature in Celsius?: ");
            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                in.nextLine();
                valid = true;
            }
             else
                {
                    trash = in.nextLine();
                    System.out.println("Invalid input. Please input a numerical value, not " + trash + "\n");
                }

        }while (!valid);

        tempF = (tempC * 1.8) + 32;
        System.out.println("Your temperature of " + tempC + " degrees in Celsius is " + tempF + " degrees in Fahrenheit");

        }
    }
