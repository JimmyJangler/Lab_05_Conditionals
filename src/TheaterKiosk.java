import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        final int DRINKING_AGE = 21;
        int age = 0;
        //output statement prompting user for input
        System.out.println("Enter your age: ");
        age = in.nextInt();
        if (age >= DRINKING_AGE) //testing for age to get wrist band
        {
            System.out.println("You get a wristband!");
        }
    }
}