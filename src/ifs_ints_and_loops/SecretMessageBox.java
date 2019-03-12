package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

import javax.swing.JOptionPane;

//    Level 0

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {

		// 1. Set a password in a String variable
		String r = "Romans828*";
		// 2. Using a pop-up, ask the first person for a secret message and store it in
		String input = JOptionPane.showInputDialog("Type in a message.");
		// a variable

		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret
		// message
		String answer = JOptionPane.showInputDialog("Only the can see the message! If you can guess the passcode.");
		// if they can guess the passcode

		// 4. If their guess matches the password, show them the secret message
		if (answer.equals(r)) {
			JOptionPane.showMessageDialog(null,""+input );
			
		}else {
		JOptionPane.showMessageDialog(null, "INTRUDER!");	
			
		}
		// 5. If the password does not match, pop-up "INTRUDER!!"
		
	}
}
