import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String polParties = "D - Democrat\tR - Republican\tI - Independent\tO - Other";

        //Main code for user input and output statements
        System.out.println(polParties + "\nChoose your party Affiliation [DRIO]");
        partyChoice = in.nextLine().toUpperCase();
        if (partyChoice.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyChoice.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyChoice.equals("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else if (partyChoice.equals("O"))
        {
            System.out.println("You have chosen other.");
        }
        else //test for invalid input
        {
            System.out.println("You input an illegal value: " + partyChoice);
        }
    }
}