import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] words = {
			    "write", "that", "program", "java", "array", 
			    "string", "method", "class", "object", "system", 
			    "computer", "network", "database", "variable", "syntax",
			    "loop", "logic", "debug", "compile", "execute"
			};
		
		char play = 'y';
		while (play == 'y') {
			int misses = 0;
			String word = words[(int) (Math.random() * words.length)];
			char[] wordtoArr = word.toCharArray();
			
			char[] masked = new char[word.length()];
			Arrays.fill(masked, '*');		
			
			while (!word.equals(String.valueOf(masked))) {
				System.out.print("(Guess) Enter a letter in word ");
				System.out.print(masked);
				System.out.print(" > ");
				char guess = input.nextLine().charAt(0);
				
				if (String.valueOf(masked).indexOf(guess) >= 0) {
					System.out.println("\t" + guess + " is already in the word");
					continue;
				}
				boolean notFound = true;
				for (int i = 0; i < wordtoArr.length; i++) {
					if (guess == wordtoArr[i]) {
						masked[i] = guess;
						notFound = false;
					}
				}
				if (notFound) {
					System.out.println("\t" + guess + " is not in the word");
					misses = misses + 1;
				}
				
				if (Arrays.equals(wordtoArr, masked)) {
					String pluralize = misses > 1 ? "times" : "time";
					System.out.println("The word is " + word + ". You missed " + misses + " " + pluralize);
					System.out.println("Do you want to guess another word? Enter y or n > ");
					play = input.nextLine().charAt(0);
				}
			}
			
			
		}
	}

}
