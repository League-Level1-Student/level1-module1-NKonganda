package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	int minutesCooked = 0;
	String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
	String stringMinutesCooked = JOptionPane.showInputDialog("How many minutes would you like your popcorn cooked");
	minutesCooked = Integer.parseInt(stringMinutesCooked);
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave(); 
	microwave.putInMicrowave(popcorn);
	microwave.setTime(minutesCooked);
	microwave.startMicrowave();
}
}
