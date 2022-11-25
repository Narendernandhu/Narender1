package staticbasic;

public class Staticblock {

	int number;
	static {
		System.out.println("static method");
	}

	{
		System.out.println("non static method");
	}

	public Staticblock() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main kethod");
	}

}
