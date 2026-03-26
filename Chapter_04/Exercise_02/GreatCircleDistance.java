import java.util.Scanner;

public class GreatCircleDistance {
	public static void main(String[] args) {
		double distance;
		double angleArg;
		double angle;
		final double RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double latA = Math.toRadians(input.nextDouble());
		double longA = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double latB = Math.toRadians(input.nextDouble());
		double longB = Math.toRadians(input.nextDouble());
		
		angleArg = Math.sin(latA) * Math.sin(latB) + Math.cos(latA) * Math.cos(latB) * Math.cos(longA - longB);
		angle = Math.acos(angleArg);
		distance = RADIUS * angle;
		System.out.println("The distance between the two points is " + distance + " km");
	}
}
