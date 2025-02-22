//  //* Your goal is to write methods, write conditionals, generate random numbers, and ask the user if the output is correct or incorrect.
// switchPlanet method

// Write a boolean method using a switch that prints a random fact about a planet and returns whether that fact is true or false.

// Name this method switchPlanet. (1 point)
// The method should take in a number. (1 point)
// Use a switch to determine which planet fact is selected.
// You should have 10 planet fact options (5 facts true and 5 false). (3 points)
// Print the random planet fact. (1 point)
// Return whether the fact is true or false. (1 point)
// Main method

public class switchP{

    public static void switchPlanet(int num){
        switch (num){
            //odd true even false 
            case 1:
                System.out.println("You can't stand on Uranus"); 
                break;
            case 2:
                System.out.println("The Earth is the center of our universe");
                break;
            case 3:
                System.out.println("The whole of Mars is as cold as the South Pole");   
                break;
            case 4:

                System.out.println("Saturns rings are 100% water");
                break;
            case 5:

                System.out.println("Jupiter's largest moon has a salty ocean that contains more water than on Earth");
                break;
            case 6:

                System.out.println("Mercury takes roughly ten Earth months to orbit the Sun");
                break;
            case 7:

                System.out.println("It would take 100 times longer to travel around the Sun than the Earth");
                break;
            case 8:

                System.out.println("An earth day is shorter than a year on Venus");
                break;
            case 9:

                System.out.println("Pluto isn't the only dwarf planet in our Solar System - we have six");
                break;
            case 10:

                System.out.println("The Solar System is roughly 7 billion years old");
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
    }
}

// Ask the user if they would like to play again? Repeat the game if they choose yes. (3 points)
// compare method

// Write a void method that compares the result from the switchPlanet method with the user's answer to determine if the user is correct or incorrect.

// Name this method compare. (1 point)
// This method should be void. (1 point)
// Compare the result from the switchPlanet method with the user's answer using a conditional.
// Be sure to allow for variations in the user's answer (allow true, True, TRUE, etc.). (3 points)
// Print whether they are correct or incorrect. (1 point)
// Example output:  

// The Earth is the densest planet in the Solar System.
// True or False?   true
// Correct
// Play again (yes or no)?  no

// Test your program several times using different input to ensure that it is working properly.

// Note: Submit your Java file.
// ***//

