
package Nonline;
import java.util.Scanner;
public class DemoEmployeeProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input Number of Loop:");
        int n = sc.nextInt();sc.nextLine();
        for(int i=1;i<n;i++){
        int id;     //= 9999  
        String name;//= "Yon Longdy";
        String sex; //= "M"; 
        int age;    //= 22;
        double salary;//= 100;
        int hour;   //= 8;
        //double  totalsalary;// = (salary * hour);
        System.out.print("ID  :");
        id = sc.nextInt();sc.nextLine();
        System.out.print("Name:");
        name = sc.nextLine();
        System.out.print("Sex :");
        sex = sc.nextLine();
        System.out.print("Age :");
        age = sc.nextInt();
        System.out.print("Hour:");
        hour = sc.nextInt();
        System.out.print("Salary:");
        salary = sc.nextDouble();
        double  totalsalary = hour * salary;
        System.out.println("ID  :"+id+"\n"+"Name:"+name+"\n"+"Sex :"+sex+"\n"+"Age :"+age+"\n"+"Hour:"+hour+"\n"+"Salary:"+salary+"\n"+"Total :"+totalsalary);
        System.out.println("ID"+"\t"+"Farst Name"+"\t"+"Sex"+"\t"+"Age"+"\t"+"Hour"+"\t"+"Salary"+"\t"+"Total");
        System.out.println(id+"\t"+name+"\t"+sex+"\t"+age+"\t"+hour+"\t"+salary+"\t"+totalsalary);
    }
    } 
}
