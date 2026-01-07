import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		double rate = 0.00417;
		double balance = 0;
		balance = (amount + balance) * (1 + rate);
		balance = (amount + balance) * (1 + rate);
		balance = (amount + balance) * (1 + rate);
		balance = (amount + balance) * (1 + rate);
		balance = (amount + balance) * (1 + rate);
		balance = (amount + balance) * (1 + rate);
		double halfYearBalance = (int) (balance * 100) / 100.0;
		System.out.println("After the sixth month, the account value is $" + halfYearBalance);
	}
}
