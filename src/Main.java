import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //asks the user to input principal
        System.out.println("Enter Your Deposit: ");
        double principal = s .nextDouble();

        //asks interest rate
        System.out.println("Enter Your Annual Interest Rate e.g. 1.75: ");
        double annualPercentRate = s.nextDouble();

        double rate = annualPercentRate / 100;//convert percentage to decimal

        //ask users the number of years
        System.out.println("Enter The Number Of Years: ");
        int numberOfYears = s.nextInt();

        int daysInYear = 365;
        int totalDays = daysInYear * numberOfYears;

        // to calculate future value using compound interest
        double futureValue = principal * Math.pow((1 + (rate / daysInYear)),totalDays);
        double totalInterest = futureValue - principal;

        //out put
        System.out.printf("The Future Value is : $%.2f\n" , futureValue);
        System.out.printf("Total Interest Earned: $%.2f", totalInterest);

    }
}