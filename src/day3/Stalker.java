package day3;

import javax.swing.JOptionPane;

public class Stalker {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What's your name?", "Name");
		String address=JOptionPane.showInputDialog("Where do you live?", "Address");
		String age=JOptionPane.showInputDialog("How old are you?","Age");
		JOptionPane.showMessageDialog(null, "I know who you are, "+name+". You're a "+age+" year old living on "+address+". Don't give your information to computers.");
	}
}
