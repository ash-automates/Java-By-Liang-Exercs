
public class FutureTuition {
	public static void main(String[] args) {
		final int INITIAL = 10000;
		final double INTEREST = 0.06;
		
		double afterTenYears = INITIAL * Math.pow((1 + INTEREST), 10);		
		double tuition = 0;
		int year = 1;
		
		while (year <= 4) {
			tuition = tuition + afterTenYears * Math.pow((1 + INTEREST), year - 1);
			year = year + 1;
		}		
		System.out.printf("Total tuition for a 4-year degree after 10 year is %.2f $", tuition);
	}
}
