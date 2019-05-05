package random;

import java.util.Random;

public class LotteryProgram {

	public static void main(String[] args) {
		int ticketNumber = 0;
		Random rand = new Random();

		for (int i = 0; i < 5; i++) {
			ticketNumber = rand.nextInt(500) + 1;
			i = i + 1;
			System.out.println(i + ": " + ticketNumber);
			i = i - 1;
		}

	}

}
