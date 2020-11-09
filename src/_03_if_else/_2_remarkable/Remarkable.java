package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Jack = "Nice";
String Bob = "Cool";
String Man = "Brave";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String Name = JOptionPane.showInputDialog("Enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(Name.equalsIgnoreCase("Jack")) {
	JOptionPane.showMessageDialog(null, "Jack is " + Jack);
}
else if(Name.equalsIgnoreCase("Bob")) {
	JOptionPane.showMessageDialog(null, "Bob is " + Bob);
}
else if(Name.equalsIgnoreCase("Man")) {
	JOptionPane.showMessageDialog(null, "Man is " + Man);

	
}
}
}

