/*Practicing writing methods in a seperate file
 * Kit Edwards 2/15/2025
 * JDK 18
 */
import java.util.Scanner;

public class randomCalculations{
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to add, subtract, multiply or divide?");
        String choice= input.next();

        System.out.println("Pick an integer number:");
        int n1=input.nextInt();

        System.out.println("Pick an integer number: ");
        int n2=input.nextInt();

        int r1=calculations.generateRandomNum(n1,n2);
        int r2=calculations.generateRandomNum(n1,n2);
        System.out.println("Random number 1: "+ r1 +"\nRandom number 2: "+r2);

        switch (choice){
            case "add":
                System.out.println(r1+" + " + r2 + " = " + calculations.add(n1, n2));
                break;
            case "subtract":
                System.out.println(r1+" - " + r2 + " = " + calculations.subtract(n1, n2));
                break;
            case "multiply":
                System.out.println(r1 + " x " + r2 + " = "+ calculations.multiply(n1, n2));
                break;
            case "divide":
                System.out.println(r1 + " / " + r2 + " = " + calculations.divide(n1, n2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
