
package loop_Pattern;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double exchangeRateUSDToKHR = 4000; // Adjust this based on actual rates
        double exchangeRateKHRToBARD = 20; // Replace with actual rate for BARD
        int choice;

        do {
            System.out.println("\nCurrency Converter");
            System.out.println("1. USD to KHR");
            System.out.println("2. KHR to USD");
            System.out.println("3. KHR to BARD");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter USD amount: ");
                    double usdAmount = scanner.nextDouble();
                    double khrAmount = usdAmount * exchangeRateUSDToKHR;
                    System.out.println(usdAmount + " USD is equal to " + khrAmount + " KHR");
                    break;
                case 2:
                    System.out.print("Enter KHR amount: ");
                    khrAmount = scanner.nextDouble();
                    usdAmount = khrAmount / exchangeRateUSDToKHR;
                    System.out.println(khrAmount + " KHR is equal to " + usdAmount + " USD");
                    break;
                case 3:
                    System.out.print("Enter KHR amount: ");
                    khrAmount = scanner.nextDouble();
                    double bardAmount = khrAmount * exchangeRateKHRToBARD;
                    System.out.println(khrAmount + " KHR is equal to " + bardAmount + " BARD");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        scanner.close();
    }
}
