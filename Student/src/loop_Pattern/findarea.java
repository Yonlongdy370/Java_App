
package loop_Pattern;
import java.util.Scanner;
public class findarea {
    static int sum(int n){
        return (n==1)? 1: n * sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number'!':");
        int x = sc.nextInt();sc.nextLine();
        System.out.println("Sum="+(sum(x))+"!");
    }
}
