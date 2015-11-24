package day1.robot;

import java.awt.Color;


import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot robot= new Robot();
		robot.setY(800);
		robot.setX(200);
		robot.penDown();
		robot.setPenColor(Color.red);
		robot.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			robot.move(400);
			robot.turn(90);
		}
			
	}
}