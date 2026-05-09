public class RandomNumberSelector {

	public static void main(String[] args) {
		System.out.println(getRandom(2, 3, 5, 7, 11));
	}

	public static int getRandom(int... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			System.exit(0);
		}
		int randomIndex = (int) (Math.random() * numbers.length);
		return numbers[randomIndex];
	}
}
