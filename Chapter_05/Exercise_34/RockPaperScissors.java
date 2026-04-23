import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int myScore = 0;
        int compScore = 0;
        Scanner input = new Scanner(System.in);

        while (Math.abs(myScore - compScore) < 3) {
            System.out.println(
                "Pick 1 for Rock, 2 for Paper, 3 for Scissors: "
            );
            int myChoice = input.nextInt();
            int compChoice = 1 + (int) (Math.random() * 3);

            String myChoiceInWords =
                myChoice == 1
                    ? "Rock"
                    : myChoice == 2
                        ? "Paper"
                        : myChoice == 3
                            ? "Scissors"
                            : "N/A";
            String compChoiceInWords =
                compChoice == 1
                    ? "Rock"
                    : compChoice == 2
                        ? "Paper"
                        : compChoice == 3
                            ? "Scissors"
                            : "N/A";

            if (
                (myChoice == 1 && compChoice == 3) ||
                (myChoice == 2 && compChoice == 1) ||
                (myChoice == 3 && compChoice == 2)
            ) {
                System.out.println(
                    "You win! CPU picked " +
                        compChoiceInWords +
                        ", you picked " +
                        myChoiceInWords +
                        "."
                );
                myScore = myScore + 1;
            } else if (myChoice == compChoice) {
                System.out.println(
                    "Draw! CPU picked " +
                        compChoiceInWords +
                        ", you picked " +
                        myChoiceInWords +
                        "."
                );
                myScore = myScore + 1;
                compScore = compScore + 1;
            } else {
                System.out.println(
                    "You lose! CPU picked " +
                        compChoiceInWords +
                        ", you picked " +
                        myChoiceInWords +
                        "."
                );
                compScore = compScore + 1;
            }
            System.out.println("CPU: " + compScore + " You: " + myScore);
        }
        System.out.print("Game Over, ");
        if (compScore > myScore) {
            System.out.println("you lose!");
        } else {
            System.out.println("you win!");
        }
    }
}
