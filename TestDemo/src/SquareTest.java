import junit.framework.TestCase;

public class SquareTest extends TestCase {

	public void test() {

		// Square s = new Square();
		// int output = s.square(5);
		// assertEquals(25, output);
		assertEquals(25, Square.square(5));

	}

	public void test1() {

		assertEquals(125, Square.cube(5));

	}

	public void test2() {

		assertTrue(Square.prime(5));

	}

}
