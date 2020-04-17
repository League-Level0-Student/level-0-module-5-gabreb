package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ROBOTPROJECT {
	static Robot rob = new Robot(); 
public static void main(String[] args) {
	
	rob.penDown();
	rob.setPenColor(Color.red);
	rob.setSpeed(6);
}


private void drawSquare() {
	for (int i = 0; i < 4; i++) {
	rob.move(100);
	rob.turn(90);
	}
	
}









}
