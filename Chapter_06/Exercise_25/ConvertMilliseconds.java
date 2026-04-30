import java.util.Scanner;

public class ConvertMilliseconds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a long integer for milliseconds: ");
		
		long millis = input.nextLong();
		System.out.println(millis + " in h:m:s format is " + convertMillis(millis));		
	}

	public static String convertMillis(long millis) {
		long seconds = getSeconds(millis);
		long minutes = getMinutes(seconds);
		long hours = getHours(minutes);
		
		return hours + ":" + minutes % 60 + ":" + seconds % 60;
	}
	
	public static long getSeconds(long millis) {
		return millis / 1000;		
	}
	
	public static long getMinutes(long seconds) {
		return seconds / 60;
	}
	
	public static long getHours(long minutes) {
		return minutes / 60;
	}
}
