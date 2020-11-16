package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
if(JOptionPane.showInputDialog("Who makes it, has no need for it.\nWho buys it, has no use for it.\nWho uses it can neither see nor feel it.\n What is it?").equalsIgnoreCase("Coffin")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The correct answer was Coffin!");
}


if(JOptionPane.showInputDialog("What must be broken before you can use it?").equalsIgnoreCase("egg")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The correct answer was Egg!");
}
JOptionPane.showMessageDialog(null, "Your score is " + score + "!");

		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

