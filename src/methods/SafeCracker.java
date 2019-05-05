package methods;

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {
	static boolean dontGotIt = true;

	public static void main(String[] args) {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */
		int i = 9999900;
		while (dontGotIt) {
			tryCode(i);
			tryCode(i + 1);
			i = i + 2;
		}

	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			dontGotIt = false;
			System.exit(0);

		}
	}

	private static void playTheSoundOfSuccess() {
		try {
			AudioClip sound = JApplet.newAudioClip(SafeCracker.class.getResource("me-gusta.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
