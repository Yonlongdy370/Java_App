package Array;
import java.util.Scanner;
public class ArrayFuction {

    static Scanner sc = new Scanner(System.in);
    
    static void input(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of Array:[" + i + "]");
            arr[i] = sc.nextInt();
        }
    }
    
    static int[] Input(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of Array:[" + i + "]");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void Output(int arr[], int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    static int Sum(int[] arr, int n) {
        int Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += arr[i];
            System.out.print(arr[i] + "+");
        }
        System.out.println("\b:" + Sum);
        return Sum;
    }

    static int Max(int[] arr, int n) {
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\b:" + max);
        return max;
    }

    static int Min(int[] arr,int n) {
        int min = arr[0];
        for (int i = 1; i<n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("\b:" + min);
        return min;
    }

    public static void main(String[] args) {
        System.out.print("How to number do you want to input?:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr = Input(n);
        System.out.println("---------> OUTPUT MIN <---------");
        Output(arr, n);
        int min = Min(arr, n);
        System.out.println("The minimum number of array is:" + min);
        System.out.println("---------> OUTPUT MAX <---------");
        Output(arr, n);
        int max = Max(arr, n);
        System.out.println("The maximum number of array is:" + max);
        System.out.println("---------> OUTPUT SUM <---------");
        int Sum = Sum(arr, n);
        System.out.println("The Sum All Number of Array is:" + Sum);
    }

}
