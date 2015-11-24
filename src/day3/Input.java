package day3;

import javax.swing.JOptionPane;

public class Input {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello!");
		String input=JOptionPane.showInputDialog("Input Test", "Type something");
		JOptionPane.showMessageDialog(null, input);
	}
}
