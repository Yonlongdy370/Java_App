
package loop_Pattern;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(generatePascalNumber(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int generatePascalNumber(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return generatePascalNumber(row - 1, col - 1) + generatePascalNumber(row - 1, col);
        }
    }  
}
