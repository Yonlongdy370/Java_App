
package student;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cormparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intput Process Number:");
        int n = sc.nextInt();sc.nextLine();
         for ( int i = 1; i <=n; i++){
            System.out.print("Enter Number (x):");
            double x = sc.nextDouble();
            System.out.print("Enter Number (y):");
            double y = sc.nextDouble();

            if (x == y) {
            System.out.println("x is equal to y");
            } else if (x <= y) {
                System.out.println("x is less than or equal to y");
            } else if (x >= y) {
                System.out.println("x is greater than or equal to y");
            } else if (x != y) {
                System.out.println("x is not equal to y");
            } else if (x < y) {
                System.out.println("x is less than y");
            } else if (x > y) {
                System.out.println("x is greater than y");
            }
        }
     }
  }
    
