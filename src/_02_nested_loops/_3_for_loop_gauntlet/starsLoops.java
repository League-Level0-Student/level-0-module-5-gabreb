package _02_nested_loops._3_for_loop_gauntlet;

public class starsLoops {
public static void main(String[] args) {
	for (int i = 2; i < 8; i++) {
		for (int z = 1; z < i; z++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
