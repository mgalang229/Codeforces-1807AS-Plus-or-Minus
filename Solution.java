import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
			if (a + b == c) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
		fs.close();
	}
}
