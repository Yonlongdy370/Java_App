package myapp;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        char gender;
        String address;
        System.out.print("ID:");
        id = sc.nextInt(); sc.nextLine();
        System.out.print("NAME:");
        name = sc.nextLine();
        System.out.print("GENDER:");
        gender = sc.next().charAt(0); sc.nextLine();
        System.out.print("ADDRESS:");
        address = sc.nextLine();
        String data = id +"\t"+ name+ "\t"+ gender + "\t"+ address;
        JOptionPane.showConfirmDialog(null, data);
                
    }
    
}
