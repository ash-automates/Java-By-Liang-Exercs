import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		int[] counts = new int[50];
					
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 50: ");
		int value = input.nextInt();
		
		while (value != 0) {
			counts[value - 1] = counts[value - 1] + 1;
			value = input.nextInt();			
		}
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				String pluralizer = counts[i] == 1 ? "time" : "times";
				System.out.println((i + 1) + " occurs " + counts[i] + " " + pluralizer);
			}
		}
	}

}
