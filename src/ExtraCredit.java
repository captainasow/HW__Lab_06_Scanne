import java.util.Random;
import java.util.Scanner;

public class ExtraCredit
{
    public static void main(String[] args)
    {
        int playchoice;

        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        System.out.println(" Pick a number between 1-10: ");
        if (in.hasNextInt())
        {
            playchoice = in.nextInt();
            System.out.println(" The computer chose: " + val + " You chose:" + playchoice);
            if (val == playchoice)
                System.out.println("You're on the money! ");
            else if (val > playchoice)
                System.out.println(" You should have gone higher. ");
            else if (playchoice > val)
                System.out.println(" You should have gone lower. ");
        }
        else
        {
            System.out.println(" Bad Input! ");
            System.exit(0);
        }
    }
}
