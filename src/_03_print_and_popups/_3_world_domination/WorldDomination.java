package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Do you know how to write code");
		// 1. Ask the user if they know how to write code.
			if(question.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "You will rule the world");
			}
			else JOptionPane.showMessageDialog(null, "Sign up for classes at the League");
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}
