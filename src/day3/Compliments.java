package day3;

import javax.swing.JOptionPane;

public class Compliments {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What's your name?", "Name");
		int yesno=JOptionPane.showConfirmDialog(null, name+", are you cool?");
		if(yesno==0){
			JOptionPane.showMessageDialog(null, "LIES!!!");
		}
		if(yesno==1){
			JOptionPane.showMessageDialog(null, "For once, you're right.");
		}
		if(yesno==2){
			JOptionPane.showMessageDialog(null,"You won't even answer cuz you know you're not.");
		}
	}
}
