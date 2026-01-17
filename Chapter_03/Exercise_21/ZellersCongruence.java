import java.util.Scanner;

public class ZellersCongruence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1−12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1−31: ");
		int dayOfMonth = input.nextInt();
		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}
		int yearOfCentury = year % 100;
		int code = (dayOfMonth 
				+ 26 * (month + 1) / 10 
				+ yearOfCentury 
				+ yearOfCentury / 4
				+ year / 400
				+ 5 * (year / 100)
				) % 7;
		String dayOfWeek = "";
		switch (code) {
		case 0:
			dayOfWeek = "Saturday";
			break;
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		default:
			System.out.println("This shouldn't happen...");
			break;
		}
		System.out.println("Day of the week is " + dayOfWeek);
	}

}
