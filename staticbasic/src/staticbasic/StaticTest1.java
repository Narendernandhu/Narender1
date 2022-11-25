package staticbasic;

import java.util.Random;

public class StaticTest1 {

	static int number;

	public static void main(String[] args) {

		StaticTest1.number = new Random().nextInt();
		StaticTest1.number = new Random().nextInt();

		System.out.println(StaticTest1.number);
		System.out.println(StaticTest1.number);
	}

	public static void print() {
		System.out.println("Static method"); // variables
	}

	public void print2() {
		System.out.println("non static method");
	}
}
