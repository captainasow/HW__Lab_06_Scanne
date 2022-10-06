import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double galGas = 0;
        double milGal = 0;
        double priceGal = 0;
        double gasCost;
        double hundPrice;

        System.out.println(" Enter your number of gallons of gas in the tank: ");
        if (in.hasNextDouble())
        {
            galGas = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println(" Please use Integers");
            System.exit(0);
        }
        System.out.println(" Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            milGal = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println(" Please use Integers");
            System.exit(0);
        }
        System.out.println(" Enter the price of gas per gallon ");
        if (in.hasNextDouble())
        {
            galGas = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println(" Please use Numbers with decimals");
            System.exit(0);
        }

        gasCost = milGal * priceGal;
        System.out.println(" It would cost you " + gasCost + " to drive 100 miles. ");
        hundPrice = galGas * milGal;
        System.out.println(" You can drive "  + hundPrice + " miles before you'll run out of gas");
    }
}