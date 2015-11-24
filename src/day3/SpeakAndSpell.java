package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			speak("Spell claustrophobia");
			String spelling=JOptionPane.showInputDialog("Spelling");
			if(spelling.equals("claustrophobia")){
				speak("Correct");
			}else{
				speak("Incorrect. It is spelled c,l,a,u,s,t,r,o,p,h,o,b,i,a, not "+ spelling);
			}			
		}


		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


