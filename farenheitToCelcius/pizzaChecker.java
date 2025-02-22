/*Ask the user how many slices of pizza do they want. Save this in a variable. You can use Scanner or JOptionPane. (1 point)
Validate using a loop that they did not choose a number larger than 8 or smaller than 0. There are only 8 slices of pizza. (3 points)
Determine the percentage of pizza that they ate by dividing the number of slices by 8 (hint: remember integer division might create issues). (1 point)
Using conditionals to display a message based on how much pizza they ate. You choose an appropriate message. (5 points)
Percent is 0 
Percent less than or equal to 0.3
Percent is greater than 0.3 and less than or equal to 0.5
Percent is greater than 0.5
Percent is 1
Example Output:
How many slices of pizza would you like (total of 8)?  3
You ate 0.375 percent of the pizza.
You must not be that hungry.

How many slices of pizza would you like (total of 8)?  8
You ate the whole pizza!

How many slices of pizza would you like (total of 8)?  -1
How many slices of pizza would you like (total of 8)?  11
How m! */
import java.util.Scanner;

public class pizzaChecker
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);

        System.out.print("Please enter a number of slices that you want (total of 8): ");
        int userSlices=input.nextInt();

        //loop asking for larger than 88
        while (userSlices>8||userSlices<0)
        {
            System.out.println("Please enter a number from 0-8: ");
            userSlices=input.nextInt();
        }

        double pizzaPercent=(userSlices/8.0);
        //display a message depending on amount of pizza the user ate

        String message="You ate " + pizzaPercent + " of the pizza";
        //if 0
        if (pizzaPercent==0)
        {
            System.out.println(message + "\nWow come back later if you get hungry!");
        }
        //if <=.3
        else if( pizzaPercent<=.3)
        {
            System.out.println(message+ "\nYou must not be very hungry");
        }
        //if >=.3&&<=.5
        else if(pizzaPercent>=.3&&pizzaPercent<=.5)
        {
            System.out.println(message + "\nWow you ate a decent amount");
        }
        //if >.5
        if(pizzaPercent>=.5&& pizzaPercent<1.0)
        {
            System.out.println(message + "\nYou were one hungry hippo");
        }
        //if 100%%%
        else if (pizzaPercent==1.0)
        {
            System.out.println("\nWow you ate the whole pizza!");
        }
    }
}

