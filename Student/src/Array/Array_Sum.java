package Array;
import java.util.Scanner;
public class Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements of the array:");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("----------> OUTPUT <----------");
        for(int i = 0; i < size; i++)
            System.out.print(+array[i]+"+");
            System.out.println("\b="+sum);
            System.out.println("Sum of the array elements: "+sum);
    }
}
