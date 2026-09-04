package basics;

public class ForLoop {
	public static void main(String[] args ) {
		//outer loop
		for (int a = 1; a <= 6; a++) {
			//inner loop
			for (int b = 1; b <= 6; b++) {
				System.out.print(a * b + " ");
			}
			System.out.println();
		}
	}

}
