/**
This program generates a random number from 1-10 
and then have the user try to guess that number
* Kit Edwards 2/7/2025
* JDK 18 **/

import javax.swing.JOptionPane;

public class GuessingGame {

    public static void main(String[] args) {
        int computerNumber= (int)(Math.random()*10 + 1);
        char playAgain;
        //generate this number
        System.out.println("The correct guess would be " + computerNumber);
               
        String result= null;
       
        do {

            int userAnswer=0;
            int count=0;

        while (computerNumber != userAnswer)
            {
            count++;
            String response= JOptionPane.showInputDialog(null,
            "Enter a guess between 1 and 10");
            //asks user for a number
            userAnswer=Integer.parseInt(response);
            //stores users answer
            {
                result="Invalid guess";
            }
            if (userAnswer == computerNumber)
            {
                result="You guessed correctly";
            }
            else 
            {
            if (userAnswer <=0 || userAnswer>10)
            {
                result="Invalid guess";
            }
            else if (userAnswer>computerNumber)
            {
                result="You're guessing too high";
            }
            else
            {
                result= "You're guessing too low";
            }
            }
            JOptionPane.showMessageDialog(null, result + "\nTry number: "+ count);
        }
        //provide feedback to the user on how many guesses
        if (count==1){
            JOptionPane.showMessageDialog(null, "You must be psychic!");
        }
        else if (count<3){
            JOptionPane.showMessageDialog(null, "Amazing!");
        }
        else if (count<5){
            JOptionPane.showMessageDialog(null, "Great Job!");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "you kind of suck at this");
        }
        var response= JOptionPane.showInputDialog(null,"Want to play again? Y/y to keep playing.");
        playAgain=response.charAt(0);
    } 
    while (playAgain=='Y'||playAgain=='y');
    }
}
