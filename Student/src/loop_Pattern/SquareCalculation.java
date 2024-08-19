package loop_Pattern;
import java.util.Scanner;
public class SquareCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter   a number: ");
        double number = sc.nextDouble();
        double square = square(number);
        System.out.println("The square of " + number + " is: " + square);
    }

    public static double square(double number) {
        return number * number;
    }
}
