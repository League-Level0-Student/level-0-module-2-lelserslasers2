package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		String hieght = JOptionPane.showInputDialog("Enetr your height in inches:");
		int intHieght = 0;
		intHieght = Integer.parseInt(hieght);
		if (intHieght < 48) {
			System.out.println("You need to grow");
		} else {
			System.out.println("You can ride!");
		}

	}

}
