import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in); // scanner
        //variable declarations
    double itemPrice = 0.0;
    final double FREE_SHIPPING = 100.0;
    double shippingCost = 0.0;
    double totalPrice = 0.0;
    String trash = "";

        System.out.println("What is the price of the item?");
        if (in.hasNextDouble())
        {
            //read item price
            itemPrice = in.nextDouble();
            in.nextLine(); //clear keyboard buffer
            if (itemPrice >= FREE_SHIPPING)
            {
                shippingCost = 0.0;
                System.out.println("You Qualify with free shipping!");
            }
            else
            {
                shippingCost = itemPrice * 0.02;
                System.out.println("The price of shipping for this item is: $" + shippingCost);
            }
            totalPrice = itemPrice + shippingCost;
            System.out.println("The total price with shipping is: $" + totalPrice);
        }
        else //testing for invalid input
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid price: " + trash);
        }
    }
}