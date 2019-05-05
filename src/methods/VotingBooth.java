package methods;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Enetr your age:");
		int intAge = 0;
		intAge = Integer.parseInt(age);
		if (intAge < 18) {
			System.out.println("Noone cares what u think");
		} else {
			String dontCare = JOptionPane.showInputDialog("Who do u think should be president");

		}

	}

}
