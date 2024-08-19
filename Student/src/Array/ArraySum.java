package Array;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new  int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter Number["+i+"]:");
            nums[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<5;i++){
            sum = sum += nums[i];
        }
        for(int i=0;i<5;i++)
            System.out.print(nums[i]+"+");
            System.out.println("\b="+sum);
    }
}
