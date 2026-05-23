import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		Random rand = new Random(1000);
		for (int i = 0; i < 50; i++) {
			if (i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%2d ", rand.nextInt(100));
		}
		System.out.println();
	}

}
