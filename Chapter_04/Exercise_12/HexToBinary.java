import java.util.Scanner;

public class HexToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();		
		
		if (hexString.length() != 1) {
			System.out.println(hexString + " is an invalid input");
			System.exit(0);
		}
		
		int hexToDecimal = -1;
		char digit = Character.toUpperCase(hexString.charAt(0));
		
		if (digit >= 'A' && digit <= 'F') {
			hexToDecimal = 10 + (digit - 'A');
		} else if (digit >= '0' && digit <= '9') {
			hexToDecimal = 0 + (digit - '0');
		} else {
			System.out.println(digit + " is an invalid input");
			System.exit(0);
		}
		
		String binary = "";
		
		if (hexToDecimal >= 8) {
			binary = binary + '1';
			hexToDecimal = hexToDecimal - 8;
		} else {
			binary = binary + '0';
		}
		
		if (hexToDecimal >= 4) {
			binary = binary + '1';
			hexToDecimal = hexToDecimal - 4;
		} else {
			binary = binary + '0';
		}
		
		if (hexToDecimal >= 2) {
			binary = binary + '1';
			hexToDecimal = hexToDecimal - 2;
		} else {
			binary = binary + '0';
		}
		
		if (hexToDecimal >= 1) {
			binary = binary + '1';			
		} else {
			binary = binary + '0';
		}
		
		System.out.println("The binary value is " + binary);
	}	
}
