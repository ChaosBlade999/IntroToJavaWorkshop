package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot robot=new Robot();

	void go() {
			robot.setSpeed(10);
			robot.setPenWidth(5);
			robot.penDown();
			robot.hide();
			robot.setX(812);
			robot.setY(520);
			for (int i = 0; i < 1000; i++) {
				drawSquare();
			}



	}


	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			robot.setRandomPenColor();
			robot.move(20);
			robot.turn(15);
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
