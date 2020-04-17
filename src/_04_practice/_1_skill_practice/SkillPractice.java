package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	


// Tell them how many cents they have (hint multiply by 10)

int D = Integer.parseInt(dimes);
D = (D*10);
JOptionPane.showMessageDialog(null, "You have " + D + " cents!");

// Ask the user how tall they are (inches)

String tall = JOptionPane.showInputDialog("How tall are you in inches?");
int T = Integer.parseInt(tall);
if (T<36) {
	JOptionPane.showMessageDialog(null, "Eat Wheaties"); 
}

// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	System.out.println(i);
}



}

void skill3() { // Get a random number that is less than 20 and print it to the console 

Random randy = new Random();
int x = randy.nextInt(21);


// Get another random number that is less than 10 and print it to the console 
Random ran = new Random(); 
int y = ran.nextInt(11); 


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 

JOptionPane.showMessageDialog(null, "The difference between 2 random numbers is " + (x-y) + ".");

}

void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog("What city do you love in?");

// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equalsIgnoreCase("san diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City"); 
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego");
}


// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

String cars = JOptionPane.showInputDialog("How many cars do you have?"); 
int z = Integer.parseInt(cars);
if (z==0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation!");
}

// If there is 1 car, use a pop-up to display the make/model of the car 
else if (z>=1) {
	JOptionPane.showMessageDialog(null, "You have " + (z*4) + " wheels on you cars (if you don't have a jeep");
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What is the name of your school?"); 

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is an awesome school!"); 

}
}
