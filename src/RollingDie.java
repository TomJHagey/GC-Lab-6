
import java.util.Scanner;
import java.util.Random;

public class RollingDie {

	public static void main(String[] args) {

		diceRoll(5);

	}

	private static void diceRoll(int rollTheDie) {
		Random dice = new Random();
		Scanner scnr = new Scanner(System.in);

		String userWantsToPlay = "y";
		while (userWantsToPlay.startsWith("y")) {

			int faces;

			System.out.println("How many sides does your pair of dice have?");

			faces = scnr.nextInt();
			System.out.println("Roll 1:");

			for (int i = 0; i < 2; i++) {

				int result;
				result = dice.nextInt(faces);

				System.out.println(result + 1);

			}
			System.out.println("Roll Again? (y/n)");
			userWantsToPlay = scnr.next();
		}
	}
}

