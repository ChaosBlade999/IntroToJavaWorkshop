package day1.robot;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class TriangleShell {
	Robot robot=new Robot();

	// 1. Create a new Robot

	
	void go() {
		robot.setSpeed(10);
		robot.penDown();
		robot.hide();
		int tri=50;
		for (int i = 0; i < 500; i++) {
			robot.setPenColor(Color.red);
			tri+=10;
			drawTriangle(tri);
			robot.turn(6);
		}

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50

		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			robot.move(length);
			robot.turn(120);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
