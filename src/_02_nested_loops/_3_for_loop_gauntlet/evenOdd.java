package _02_nested_loops._3_for_loop_gauntlet;

public class evenOdd {
	public static void main(String[] args) {
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}
}
