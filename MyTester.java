import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	//tests base case of 0!
	@Test
	public void testNfactorialB0() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(0);
		assertEquals("0! is 1", 1, actual);
		//fail("Not yet implemented");
	}
	
	//tests base case of 1!
	@Test
	public void testNfactorialB1() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(1);
		assertEquals("1! is 1", 1, actual);
		//fail("Not yet implemented");
	}
		
	//tests factorial of negative number
	@Test
	public void testNfactorialNegative() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(-1);
		assertEquals("-1! is invalid (0)", 0, actual);
		//fail("Not yet implemented");
	}

	//tests factorial of single digit number
	@Test
	public void testNfactorialSingleDigit() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(5);
		assertEquals("5! is 6", 120, actual);
		//fail("Not yet implemented");
	}
	
	//tests factorial of 2 digit numbers
	@Test
	public void testNfactoriaTwoDigitl() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(10);
		assertEquals("10! is 3628800", 3628800, actual);
		//fail("Not yet implemented");
	}

	/**start tests where values are in the given array**/
	//tests if value can be found as right leaf node in left subtree
	@Test
	public void testBinarySearchLRightLeafF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,5);
		assertEquals("5 is in index 2", 2, actual);
		//fail("Not yet implemented");
	}
	
	//tests if value can be found as left leaf node in left subtree
	@Test
	public void testBinarySearchLLeftLeafF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,0);
		assertEquals("0 is in index 0", 0, actual);
		//fail("Not yet implemented");
	}
	
	//tests if value can be found as right leaf node in right subtree
	@Test
	public void testBinarySearchRRightLeafF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,10);
		assertEquals("10 is in index 4", 4, actual);
		//fail("Not yet implemented");
	}

	//tests if value can be found as left leaf node in right subtree
	@Test
	public void testBinarySearchRLeftLeafF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,15);
		assertEquals("15 is in index 6", 6, actual);
		//fail("Not yet implemented");
	}
	
	//tests if value can be found as a subroot in left subtree
	@Test
	public void testBinarySearchLeftSubF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,3);
		assertEquals("3 is in index 6", 1, actual);
		//fail("Not yet implemented");
	}
	
	//tests if value can be found as a subroot in right subtree
	@Test
	public void testBinarySearchRightSubF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,12);
		assertEquals("12 is in index 5", 5, actual);
		//fail("Not yet implemented");
	}
	
	//tests if value can be found as root
	@Test
	public void testBinarySearchRootF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,8);
		assertEquals("8 is in index 3", 3, actual);
		//fail("Not yet implemented");
	}
	/**start tests where values are in the given array**/

	/**start tests where values are not in the given array**/
	//searches for value in right leaf node in left subtree
	@Test
	public void testBinarySearchLRightLeafNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,4);
		assertEquals("4 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}
	
	//searches for value in left leaf node in left subtree
	@Test
	public void testBinarySearchLLeftLeafNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,4);
		assertEquals("1 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}

	//searches for value in right leaf node in right subtree
	@Test
	public void testBinarySearchRRightLeafNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,13);
		assertEquals("13 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}

	//searches for value in left leaf node in right subtree
	@Test
	public void testBinarySearchRLeftLeafNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,11);
		assertEquals("11 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}

	//searches for value in subroot in left subtree
	@Test
	public void testBinarySearchLeftSubNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,2);
		assertEquals("2 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}

	//searches for value in subroot in right subtree
	@Test
	public void testBinarySearchRightSubNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,11);
		assertEquals("11 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}
	
	//searches for value in root
	@Test
	public void testBinarySearchRootNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,9);
		assertEquals("9 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}
	
	//searches for value less than the minimum of the tree
	public void testBinarySearchLeftNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,-3);
		assertEquals("-3 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}

	//searches for value beyond maximum of the tree
	public void testBinarySearchRightNF() {
		MyCalculator calc = new MyCalculator();
		int[] arr = {0,3,5,8,10,12,15};
		int actual = calc.binarySearch(arr,20);
		assertEquals("20 is not found (-1)", -1, actual);
		//fail("Not yet implemented");
	}
	/**end tests where values are not in the given array**/
}
