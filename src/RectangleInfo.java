import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double height = 0;
    double width = 0;
    double area = 0;
    double perimeter = 0;
    double diagonal = 0;
    boolean valid = false;
    String trash = "";


    do {
        System.out.print("What is the height of the rectangle?: ");
        if (in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
            valid = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must put in a numerical value, not " + trash + " \n");
        }
    }while (!valid);

    valid = false;

    do {
        System.out.print("What is the width of the rectangle?: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
            valid = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must put in a numerical value, not " + trash + " \n");
        }
    }while (!valid);

    area = width * height;
    perimeter = (width * 2) + (height * 2);
        System.out.println("\nThe area of your rectangle is " + area);
        System.out.println("\nThe perimeter of your rectangle is " + perimeter);

    diagonal = Math.sqrt((Math.pow(width, 2))+(Math.pow(height,2)));
        System.out.println("\nThe diagonal of your rectangle is " + String.format("%.2f", diagonal));


    }
}
