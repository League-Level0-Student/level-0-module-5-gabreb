package _02_nested_loops._3_for_loop_gauntlet;

public class tenBytenGrid {
	public static void main(String[] args) {
		int x = 0;
		for (int z = 0; z < 10; z++) {
			for (int i = 1; i < 11; i++) {
				if ((i + x) <= 10) {
					System.out.print((i + x) + "  ");
				} else {
					System.out.print((i + x) + " ");
				}

			}
			x += 10;
			System.out.println();
		}
	}
}
