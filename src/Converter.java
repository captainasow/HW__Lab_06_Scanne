import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double temp = 0;
        double farTemp = 0;

        System.out.println("\nEnter your temperature in celsius: ");

        if (in.hasNextDouble())
        {
            temp = in.nextDouble();
            farTemp = (temp * 9/5) + 32;
            System.out.println(" Your temperature in farenheit is " + farTemp );
        }
        else
        {
            System.out.println(" Bad Input! ");
        }
    }
}
