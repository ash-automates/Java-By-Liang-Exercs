import java.util.Scanner;

public class PointInRectangle {

	public static void main(String[] args) {
		// Constants for 10x5 Rectangle
		final int WIDTH = 10;
		final int HEIGHT = 5;
		
		// Prompt user for coordinates
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double horizontalDiff = x < 0 ? -x : x;
		double verticalDiff = y < 0 ? -y : y;
		if (horizontalDiff <= WIDTH / 2.0 && verticalDiff <= HEIGHT / 2.0) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}
	}

}
