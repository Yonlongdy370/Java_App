
package Array;
import java.util.Scanner;
public class Demoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new  int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter Number["+i+"]:");
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println("nums["+i+"]:"+ nums[i]);
        }
    }
}
