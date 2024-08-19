
package studentloop;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c,java,python,totalMarks;
        float avg;
        System.out.println("--------- > INPUT <---------");
        System.out.print("Enter C++ Programming   :");
        c = sc.nextInt();sc.nextLine();

        System.out.print("Enter JAVA Programming  :");
        java = sc.nextInt();sc.nextLine();

        System.out.print("Enter PYTHON Programming:");
        python = sc.nextInt();sc.nextLine();

        totalMarks = c + java + python;
        avg = (float) totalMarks / 3;

        String grade;
        if (avg >= 90 && avg <= 100) {
            grade = "A";
        } else if (avg >= 80 && avg <= 90) {
            grade = "B";
        } else if (avg >= 70 && avg <= 80) {
            grade = "C";
        } else if (avg >= 60 && avg <= 70) {
            grade = "D";
        } else if (avg >= 50 && avg <= 60) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("--------------------> OUTPUT <--------------------");
        System.out.println("Total  : " + totalMarks);
        System.out.println("Average: " + avg);
        System.out.println("Grade  : " + grade);
        System.out.println("C++\tJAVA\tPYTHON\tTOTAL\tGRADE\tAVERAGE");
        System.out.println(c+"\t"+java+"\t"+python+"\t"+totalMarks+"\t"+grade+"\t"+avg);
        
        String data = "C : "+ c + ".\t\t" + "JAVA : " + java + ".\t\t"+"PYPHON : " +python+".\n"+"GARDE :"+grade;
        JOptionPane.showMessageDialog(null,data);
    }
 }
