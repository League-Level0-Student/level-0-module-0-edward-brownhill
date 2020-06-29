package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String q1 = JOptionPane.showInputDialog("Do I need a new mic?");
		if(q1.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1 ;
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope");
		}
		q1 = JOptionPane.showInputDialog("What month is it?");
		if(q1.equalsIgnoreCase("June")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1 ;
		}
		else {
			JOptionPane.showMessageDialog(null,"nope");
		}
		JOptionPane.showMessageDialog(null, "Your score is " +score);
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
