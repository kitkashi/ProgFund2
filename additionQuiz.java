/*Coding assignment by Kit Edwards
 * made 02/08/25
 * JDK version 1.8
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class additionQuiz {
    public static void main (String [] args)
    {    
        //counters
        int correctCtr=0;
        double percent=0;
        //set as objects in order to call their methods
        NumberFormat percentFormat=NumberFormat.getPercentInstance();
        Scanner input= new Scanner(System.in);

        do{
        System.out.print("How many math problems do you want nerd ");
        int problems=input.nextInt();
        
        while (problems<=0)
        {
            System.out.print("Please enter a valid number that is greater than 0");
            problems=input.nextInt();
        }

        for(int i=0;i<problems;i++)
        {
            int randomNum=(int)(Math.random()*50+1);
            int randomNum2=(int)(Math.random()*50+1);
            int answer= randomNum+randomNum2;
            System.out.print(randomNum + " + " + randomNum2 + " = ");
            
            System.out.print("?");
            //asks for input on what answer
            int userAnswer=input.nextInt();

            //checks if input is right 
            if (userAnswer==answer)
                {
                    correctCtr++;
                    System.out.print("Correct\n");
                }
            else 
                {
                System.out.print("Incorrect\n");
                }
            }
        //casting to doubles so that the percent can be accurate and not use integer math
        double problemsDbl=(double)problems;
        //percent 
        percent=(correctCtr/problemsDbl);
        
        System.out.print("You got "+ correctCtr + " out of "+ problems+ " which is ");
        System.out.print(percentFormat.format(percent)+ "\n");
        if (percent<.7)
        {
            System.out.print("You did not pass, try again!\n");
        }
        else
        {
            System.out.print("You passed congrats!");
        }
        } while(percent<.7);
    }
}
