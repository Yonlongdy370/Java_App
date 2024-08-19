package loop_Pattern;
import java.util.Scanner;
public class Currency_Converter {
    static final double KHR_TO_USD = 10; // Replace with actual exchange rate
    static final double USD_TO_KHR = 4000; // Replace with actual exchange rate
    static final double KHR_TO_THB = 0.004167; // Replace with actual exchange rate
    static final double THB_TO_KHR = 240; // Replace with actual exchange rate

    public static double khmerToDollar(double khr) {
        return khr * KHR_TO_USD;
    }

    public static double dollarToKhmer(double usd) {
        return usd * USD_TO_KHR;
    }

    public static double khmerToBaht(double khr) {
        return khr * KHR_TO_THB;
    }

    public static double bahtToKhmer(double thb) {
        return thb * THB_TO_KHR;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        String fromCurrency, toCurrency;

        System.out.print("Enter amount:");
        amount = scanner.nextDouble();

        System.out.print("Enter from currency (A, B,C):");
        fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter to currency (A=KHR,B=USD,C=THB,D=EXIT):");
        toCurrency = scanner.next().toUpperCase();

        double result = 0;
        switch (fromCurrency +toCurrency) {
            case "A":
                result = khmerToDollar(amount);
                break;
            case "B":
                result = dollarToKhmer(amount);
                break;
            case "C":
                result = khmerToBaht(amount);
                break;
            case "D":
                result = bahtToKhmer(amount);
                break;
            default:
                System.out.println("Invalid currency conversion");
        }

        if (result != 0) {
            System.out.println(amount + fromCurrency + " is equal to " + result + " " + toCurrency);
        }
    }
}
