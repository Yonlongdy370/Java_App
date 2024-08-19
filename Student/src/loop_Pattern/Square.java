
package loop_Pattern;
import java.util.Scanner;
public class Square {
    public static double square(double number) {
        return Math.pow(number, 2);
    }

    public static void main(String[] args) {
        double num = 3.5;
        double result = square(num);
        System.out.println("Square of " + num + " is: " + result);
    }
}
