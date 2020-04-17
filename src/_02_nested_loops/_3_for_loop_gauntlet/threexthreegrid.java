package _02_nested_loops._3_for_loop_gauntlet;

public class threexthreegrid {
	public static void main(String[] args) {
		int x = 0;
		for (int z = 1; z < 4; z++) {
			for (int i = 1; i < 4; i++) {
				System.out.print((i + x) + " ");
			}
			x += 3;
			System.out.println();
		}
	}

}
