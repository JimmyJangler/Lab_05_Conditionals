import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        //birth month input
        System.out.println("What is your birth month? [1-12]");
        //if statements testing for valid input
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine(); //clear keyboard buffer
            if (birthMonth >= 1 && birthMonth <= 12) //test for valid integer range
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else //output for invalid integer
            {
                System.out.println("You entered and incorrect month value: " + birthMonth);
            }
        }
        else //output for invalid String
        {
            System.out.println("You entered an illegal value: " + trash);
        }
    }
}