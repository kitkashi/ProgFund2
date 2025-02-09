//By Kit Edwards
//Coin Toss Exercise
import java.util.Scanner;
public class TallyingCoinTossExercise {
    
    public static void main(String [] args)
    {
        int headCounter=0;
        int tailCounter=0;
        Scanner input=new Scanner(System.in);
        //creates an object around systemscanner

        System.out.println("How many times would you like to flip the coin?");
        int times=input.nextInt();

        for (int i=0;i<times;i++)
        {
            double r=Math.random();
            if (r>=.5)
            {
                headCounter++;
                System.out.println("Heads");
            }
            else {
                tailCounter++;
                System.out.println("Tails");
            }
        }
            System.out.println("\nNumber of heads: " + headCounter + "\nNumber of tails: "+ tailCounter);
        System.exit(0);
    }
}
