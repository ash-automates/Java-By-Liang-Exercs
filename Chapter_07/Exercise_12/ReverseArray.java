import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int[] reversed = reverse(numbers);
		System.out.print("The list of numbers in reverse order: ");
		for (int i : reversed) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] reverse(int[] array) {
		for (int i = 0, j = array.length - 1; i < (array.length / 2); i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
}
