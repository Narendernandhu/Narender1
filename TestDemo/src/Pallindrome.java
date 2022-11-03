
public class Pallindrome {

	static boolean isPalindrome(int input) {
		int reversed = reverse(input);
		return input == reversed;
	}

	public static int reverse(int input) {
		int lastDigit, sum = 0, temp;
		temp = input;
		while (temp > 0) {
			lastDigit = temp % 10;
			sum = (sum * 10) + lastDigit;
			temp = temp / 10;
		}
		return sum;
	}
}
