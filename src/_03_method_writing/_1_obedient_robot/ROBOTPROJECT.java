package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ROBOTPROJECT {
	static Robot rob = new Robot(); 
public static void main(String[] args) {
	
	rob.penDown();
	rob.setSpeed(20);
	String x = JOptionPane.showInputDialog("Do you want the robot to draw a square, triangle, or circle?");
	String y = JOptionPane.showInputDialog("What color of the basic rainbow do you want?");
	if (y.equalsIgnoreCase("red")) {
		rob.setPenColor(Color.red);
	}
	else if (y.equalsIgnoreCase("orange")) {
		rob.setPenColor(Color.orange);
	}
	else if (y.equalsIgnoreCase("yellow")) {
		rob.setPenColor(Color.yellow);
	}
	else if (y.equalsIgnoreCase("green")) {
		rob.setPenColor(Color.green);
	}
	else if (y.equalsIgnoreCase("purple")) {
		rob.setPenColor(Color.magenta);
	}
	else {
		rob.setPenColor(Color.blue);
	}
	if (x.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(x.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if (x.equalsIgnoreCase("circle")) {
		rob.setSpeed(100);
		drawCircle(); 
	}
	else {
			JOptionPane.showMessageDialog(null, "You answer did not match one of the options. You do not get the privilege of continuing.");
		
		}
	}
	



private static void drawSquare() {
	for (int i = 0; i < 4; i++) {
	rob.move(100);
	rob.turn(90);
	}
}
private static void drawTriangle() {
	rob.turn(30);
	for (int i = 0; i < 3; i++) {
		rob.move(100);
		rob.turn(120);
	}
}
private static void drawCircle() {
	for (int i = 0; i < 360; i++) {
	rob.move(1); 
	rob.turn(1);
	}
}










}
