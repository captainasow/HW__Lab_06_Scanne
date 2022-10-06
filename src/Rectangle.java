import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        double width = 0;
        double height = 0;
        double perimeter;
        double area;
        double hypotenuse;

        Scanner in = new Scanner(System.in);

        System.out.println(" Input the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println(" Bad input");
            System.exit(0);
        }
        System.out.println(" Input the height of the rectangle: ");
        if (in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println(" Bad input ");
            System.exit(0);
        }

        perimeter = height + height + width + width;
        System.out.println(" The perimeter of the rectangle is: " + perimeter);
        area = height * width;
        System.out.println(" The area of the rectangle is : " + area);
        hypotenuse = Math.sqrt((height * height) + (width * width));
        double roundOff = Math.round(hypotenuse * 100) / 100;
        System.out.println(" The length of the hypotenuse is " + roundOff);
















    }
}
