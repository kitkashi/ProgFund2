/*@params Calculations this is a function that produces calculations */
public class Calculations{

    public static int generateRandomNum(int a, int b){
        double range = (Math.abs(a-b)+1);
        if (a<=b){
            return (int)(Math.random()*range +a);
        } else {
            return (int)(Math.random()*range +b);
        }
    }
}