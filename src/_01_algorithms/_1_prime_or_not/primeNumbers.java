package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeNumbers {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Enter a number");
	double AD = Double.parseDouble(answer); 
	for (int i = 2; i < 10000000; i++) {
		if (AD % i != 0) {
			JOptionPane.showMessageDialog(null, "Your number is a prime number");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number isn't a prime number"); 
			System.exit(0);
		}
	}
}
}
