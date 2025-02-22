import java.util.Scanner;
public class calculat {


    public static void main (String[] arg){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter in a length of a square");
        double userLength=input.nextDouble();

        double areaCalc=calculateArea(userLength);

        double periCalc=calculatePerimeter(userLength);

        System.out.println("The area of your square is: " + areaCalc + "\nThe perimeter of your square is: " + periCalc);


    }

    public static double calculateArea(double userLength){
        return userLength * userLength;
    }

    public static double calculatePerimeter(double userLength){
        return userLength *4;
    }
}