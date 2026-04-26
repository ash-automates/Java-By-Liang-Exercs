import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		System.out.print("Pick a number and I'll tell you if it's a palindrome or not: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print(number + " is");
		String check = isPalindrome(number) ? " " : " not ";
		System.out.println(check + "a Palindrome!");
		
	}
	
	public static int reverse(int number) {
		final int LENGTH = Integer.toString(number).length();
		int reversed = 0;
		int index = 0;
		while (index < LENGTH) {
			int digit = number % 10;
			reversed = reversed + digit * (int) Math.pow(10, LENGTH - (index + 1));
			number = number / 10;
			index = index + 1;
		}
		return reversed;
	}
	
	public static boolean isPalindrome(int number) {
		if (number != 0 && number % 10 == 0) return false;
		return number == reverse(number);		
	}
}
