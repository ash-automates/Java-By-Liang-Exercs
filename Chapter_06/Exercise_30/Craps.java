
public class Craps {

	public static void main(String[] args) {				
		int total = playRound();			
		if (total == 2 || total == 3 || total == 12) {
			System.out.println("You lose");				
		} else if (total == 7 || total == 11) {
			System.out.println("You win");				
		} else {
			System.out.println("point is " + total);
			while (true) {
				int nextTotal = playRound();				
				if (nextTotal == 7) {
					System.out.println("You lose");
					break;
				} else if (nextTotal == total) {
					System.out.println("You win");
					break;
				}
			}			
		}
	}		
		
	public static int playRound() {
		int first = rollDice();
		int second = rollDice();
		int total = first + second;
		System.out.println("You rolled " + first + " + " + second + " = " + total);
		return total;
	}

	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
}
