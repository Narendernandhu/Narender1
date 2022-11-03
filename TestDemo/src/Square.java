
public class Square {

	public static int square(int x) {

		return x * x * x;

	}

	public static int cube(int x) {

		return x * x * x;
	}

	public static boolean prime(int x) {

		for (int i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}
}
