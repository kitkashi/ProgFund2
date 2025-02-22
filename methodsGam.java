/*
 * Methods Game
 * Kit Edwards
 * JDK version 18
 */

 import java.util.Scanner;

 public class methodsGam{

    public static void main (String[] arg){

        //initialize scanner obj
        Scanner input=new Scanner(System.in);
        String userPlayAgain;
        //sets normally the switch input for planet fact as true
        //random num gen between 1-10
        do {
        int num=(int)(Math.random()*10+1);

        String trueOrFal="true";
        //even are not true
        if (num%2==0)
            trueOrFal="false";
        
        //call switch planet to see planet facts
        switchP.switchPlanet(num);
        //ask if its true or false 
        System.out.print("True or false? ");
        String userGuess=input.nextLine().toLowerCase();
        //compare method

        compare.compareUserGuess(userGuess, trueOrFal);
        System.out.print("Want to play again? (yes or no): ");

        userPlayAgain=input.nextLine().toLowerCase();
        } while (userPlayAgain.equals("yes"));
        //play again?
    }
 }