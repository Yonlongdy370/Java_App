
package Function;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DemoControl {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("####0.00");
    double total,dis,pay;
        System.out.print("Input Size of Number:");
        int n = sc.nextInt();
        int i = n;
        String st;
    do{
        System.out.print("Input ID  :");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Input Name:");
        String name = sc.nextLine();
        System.out.print("Input Qantity:");
        int qty = sc.nextInt();sc.nextLine();
        System.out.print("Input Price  :");
        double price = sc.nextDouble();
        total = qty * price;
        if(total >=1 && total <10)
            dis = total * 0.1;
        else if(total >=10 && total <20)
            dis = total * 0.2;
        else if(total >=20 && total <30)
            dis = total * 0.3;
        else if(total >=30 && total <40)
            dis = total * 0.4;
        else if(total >=40 && total <50)
            dis = total * 0.5;
        else
            dis = total * 0.6;
        pay = total - dis;
        System.out.println("Total   :$"+df.format(total));
        System.out.println("Discount:$"+df.format(dis));
        System.out.println("Payment :$"+df.format(pay));
        System.out.print("Press Yes to Continue!");
        st = sc.next();
    }  while(st.equals("yes"));  
  }  
}
