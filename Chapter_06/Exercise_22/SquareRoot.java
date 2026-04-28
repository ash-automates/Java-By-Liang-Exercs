import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive double value: ");
		double num = input.nextDouble();
		System.out.println("The square root of " + num + " is " + sqrt(num));
	}
	
	public static double sqrt(double n) {
		double lastGuess = 1.0;
		double nextGuess = improveGuess(n, lastGuess);
		while (!isGoodEnough(lastGuess, nextGuess)) {
			lastGuess = nextGuess;
			nextGuess = improveGuess(n, lastGuess);
		}
		
		return nextGuess;
	}
	
	public static boolean isGoodEnough(double num1, double num2) {
		return Math.abs(num2 - num1) <= .0001;
	}
	public static double improveGuess(double n, double lastGuess) {
		return (lastGuess + n / lastGuess) / 2;
	}
}
