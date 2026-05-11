import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		double[] list = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 numbers, I will sort them for you: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		bubbleSort(list);
		System.out.println("The sorted list is: " + Arrays.toString(list));
	}

	public static void bubbleSort(double[] list) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					double temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					isSorted = false;
				}
			}			
		}
	}
}
