
package student;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ComparisonOperators {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intput Process Number:");
        int n = sc.nextInt();sc.nextLine();
         for ( int i = 1; i <=n; i++){
            System.out.print("Enter Number (x):");
            double x = sc.nextDouble();
            System.out.print("Enter Number (y):");
            double y = sc.nextDouble();

            if (x == y){
                System.out.println("---> X SUM Y <---");
                double sum = x + y;
                System.out.println("X + Y : " + sum);
            } else if (x < y){
                System.out.println("---> X DIFFERENCE Y <---");
                double difference = y - x;
                System.out.println("X - Y : " + difference);
            } else if (x > y){
                System.out.println("---> X MULTIPLY Y <---");
                double multiply = x * y;
                System.out.println("X * Y: " + multiply);
            } else if (x <= y){
                System.out.println("---> X DIVIDE Y <---");
                double divide = x / y;
                System.out.println("X / Y: " + divide);
            } else if (x >= y){
                System.out.println("---> X MULTIPLY Y <---");
                double multiply = x * y;
                System.out.println("X * Y: " + multiply);
            } else if (x != y){
                System.out.println("---> X DIVIDE Y <---");
                double divide = x / y;
                System.out.println("X - Y : " + divide);
            }else{
                System.out.println("Unsuccessful Not Found!");
          } 
        }
     }
}
