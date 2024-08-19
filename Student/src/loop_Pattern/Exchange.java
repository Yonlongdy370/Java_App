package loop_Pattern;
import java.util.Scanner;
public class Exchange {
    static void KhtoUsa( float m){
        float r = m/4100;
        System.out.println("Your Change KHR To USA :"+m+ "R="+r+"$");
    }    
    static void UsatoKh( double m){
        double d = m*4100;
        System.out.println("Your Change USA To KHR :"+m+ "$="+d+"R");
    }
    static void kHtoBah( double m){
        double k = m/115;
        System.out.println("Your Change KHR To BAH :"+m+ "R="+k+"B");
    }
    static void BahtoKh( double m){
        double b = m*115;
        System.out.println("Your Change BAH To KHR :"+m+ "B="+b+"R");
    }
    static void CurrencyConverter(){
            System.out.println("Currency Converter");
            System.out.println("1.KHR to USA");
            System.out.println("2.USA to KHR");
            System.out.println("3.KHR to BAH");
            System.out.println("4.BAH to KHR");
            System.out.println("5.EXIT PROGARM!");
    }
    public static void main(String[] args) {
        int choice;
            Scanner sc = new Scanner(System.in);
        do {
            CurrencyConverter();
            System.out.print("Enter Your Choice   :");
            choice = sc.nextInt();sc.nextLine();
            System.out.print("Enter a Number Monny:");
            long x = sc.nextInt();sc.nextLine();
            switch(choice){
                case 1: KhtoUsa(x);break;
                case 2: UsatoKh(x);break;
                case 3: kHtoBah(x);break;
                case 4: BahtoKh(x);break;
                case 5: System.out.println("Exiting Program!");break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }
        } while(choice!=5);   
        sc.close();
    }
}
