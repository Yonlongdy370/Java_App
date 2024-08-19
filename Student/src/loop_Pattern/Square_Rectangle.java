package loop_Pattern;
import java.util.Scanner;
public class Square_Rectangle {
    static void print_rectangle(int k,int l)
    {
        for ( int a = 1; a <= k; a++) {
            for (int  b = 1; b <= l; b++) {
                if (a == 1 || a == k || b == 1 || b == l)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int rows = 4, columns = 11;
        print_rectangle(rows, columns);
    }
}
