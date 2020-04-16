package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class fibonacciNums {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "I am going to print out the fibonacci numbers!");
		int x = 0;
		System.out.println(x);
		int y = 1; 
		System.out.println(y);
		int sum = x+y;
		System.out.println(sum);
		for (int i = 0; i<20;i++) {
x = y;
y = sum; 
sum = x+y;
System.out.println(sum);
		}



	}
}
//0,1,1,2,3,5,8,13,21,34,55,89,