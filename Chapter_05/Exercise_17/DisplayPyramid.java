import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();
		
		for (int i = number; i > 0; i--) {
			String line = "";
			for (int j = i; j > 1; j--) {
				line = line + (j < 10 ? j + " " : j) + " ";
			}
			for (int k = 1; k < i + 1; k++) {
				line = line + (k < 10 ? k + " " : k) + " ";
			}
			System.out.println(line);
		}
	}
}
