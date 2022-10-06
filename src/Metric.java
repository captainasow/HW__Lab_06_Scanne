import java.util.Scanner;

public class Metric
{
    public static void main(String[] args)
    {
        double meterMeas = 0.0;
        double miles;
        double feet;
        double inches;

        Scanner in = new Scanner(System.in);
        System.out.println(" Input your measurement in meters: ");
        if (in.hasNextDouble())
        {
            meterMeas = in.nextDouble();
            miles = meterMeas / 1609.34;
            System.out.println( meterMeas + "to miles is: " + miles);

            feet = meterMeas * 3.28084;
            System.out.println( meterMeas + "to feet is: " + feet);

            inches = meterMeas * 39.37007874;
            System.out.println( meterMeas + "to inches is: " + inches);
            in.nextLine();
        }
        else
        {
            System.out.println(" Bad Input! ");
            System.exit(0);
        }
    }
}
