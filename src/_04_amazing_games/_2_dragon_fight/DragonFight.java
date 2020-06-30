package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
		int dragonHealth = 100;
			// playerHealth to store your health - set it equal to 100
	
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int playerAttack = 0;
		int dragonAttack = 0;
		int scareValue = 0;
		int numberOfRocks =0;
		int rocksLoop = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game to repeat until the player or dragon run out of health
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String attack = JOptionPane.showInputDialog("It is your turn to attack. Do you want to yell, kick, or throw rocks?");
				// 4. If they typed in "yell":
				if(attack.equalsIgnoreCase("yell")) {
					playerAttack = ran.nextInt(10) + 1;
					dragonHealth = dragonHealth - playerAttack;
					scareValue = scareValue + ran.nextInt(6) ;
				}
				if(attack.equalsIgnoreCase("kick")) {
					playerAttack = ran.nextInt(25) + 1;
					dragonHealth = dragonHealth - playerAttack;
				}
				if(attack.equalsIgnoreCase("throw rocks")) {
					numberOfRocks = ran.nextInt(3) + 2;
					rocksLoop = numberOfRocks;
					while(rocksLoop >= 0) {
						playerAttack = ran.nextInt(7) +1;
						dragonHealth = dragonHealth - playerAttack;
						rocksLoop = rocksLoop - 1;
						System.out.println(rocksLoop);
					}
					JOptionPane.showMessageDialog(null, "You threw " + numberOfRocks + " rocks");
				}
				
	
					// -- Find a random number between 0 and 10 and store it in playerAttack. Use
					// ran.nextInt(10)
		
					// -- Subtract the player attack value from the dragon's health
	
				// 5. If they typed in "kick":
	
					// -- Find a random number between 0 and 25 and store it in playerAttack.
		
					// -- Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES
				dragonAttack = ran.nextInt(35) + 1 - scareValue;
				if(dragonAttack < 0)
					dragonAttack = 0;
				playerHealth = playerHealth - dragonAttack;
				
				// 6. Find a random number between 0 and 35 and store it in dragonAttack
	
				// 7. Subtract the dragon attack value from the player's health

			// ASSESS THE DAMAGE CAUSED 
				if(playerHealth <= 0 ) {
					playerLost();
				}
				else if(dragonHealth <= 0) {
					dragonLost();
				}
				// 8. If the player's health is less than or equal to 0
				// call the playerLost() method
	
			
				// 9. Else if the dragon's health is less than or equal to 0
				// call the dragonLost() method

			
			// 10.  Pop up a message that tells the player the health levels of player and
			// 		dragon.
				JOptionPane.showMessageDialog(null, "Your damage dealt was " + playerAttack);
				JOptionPane.showMessageDialog(null, "The dragon's health is " + dragonHealth);
				JOptionPane.showMessageDialog(null,  "The dragon retaliates");
				JOptionPane.showMessageDialog(null, "The dragon's damage dealt was " + dragonAttack);
				JOptionPane.showMessageDialog(null, "Your Health is " + playerHealth);
				
				
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)

		}

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "You Lost");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "You Won!");
		System.exit(0);   //This code ends the program
	}

}
