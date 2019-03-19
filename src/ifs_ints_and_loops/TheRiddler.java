package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle1.equals("coin")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("What has hands but cannot clap");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle2.equals("clock")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 2. Make a pop up to show the score.
		
		String riddle3 = JOptionPane.showInputDialog("What can you drop from the tallest building and it'll be fine but drop me in water than I die?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle3.equals("paper")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
	
}

