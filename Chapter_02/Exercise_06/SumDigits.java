import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		int hundreds = num / 100;
		int remaining = num % 100;
		int tens = remaining / 10;
		remaining %= 10;
		int sum = hundreds + tens + remaining;
		System.out.println("The sum of the digits is " + sum);
	}
}
