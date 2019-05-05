//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			randomNumber = randomMaker.nextInt(5);
			System.out.println(randomNumber);
			if (randomNumber == 1) {
				System.out.println("You are annonyiong");
			}
			if (randomNumber == 2) {
				System.out.println("You are stupid");
			}
			if (randomNumber == 3) {
				System.out.println("You are loud");
			}
			if (randomNumber == 4) {
				System.out.println("You are crazy");
			}
			if (randomNumber == 0) {
				System.out.println("YOU ARE BAD");
			}
		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
