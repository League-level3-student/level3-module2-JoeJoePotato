package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
String[] testone= {"billy", "bobby", "jeff", "mind", "oof", "john", "bobby"};
		assertEquals(5,_00_LinearSearch.linearSearch(testone,"john"));
		assertEquals(1, _00_LinearSearch.linearSearch(testone,"bobby"));
String[] testtwo= {"i ", "j", "i"};
		assertEquals(2,_00_LinearSearch.linearSearch(testtwo,"i"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
int[] testone= {1,2,3,4,5,6,7,8,9,10};
		assertEquals(2,_01_BinarySearch.binarySearch(testone,0,9,3));
		assertEquals(-1,_01_BinarySearch.binarySearch(testone,0,9,0));
		assertEquals(-1,_01_BinarySearch.binarySearch(testone,0,6,0));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
int[] testone= {100, 140, 180, 220, 260};
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(testone, 180));
		assertEquals(-1,_02_InterpolationSearch.interpolationSearch(testone, 1));
		assertEquals(0,_02_InterpolationSearch.interpolationSearch(testone, 100));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
int[] testone= {1,2, 3, 5, 8, 200, 201};		
		assertEquals(2,_03_ExponentialSearch.exponentialSearch(testone, 3));
		assertEquals(-1,_03_ExponentialSearch.exponentialSearch(testone, 202));
		assertEquals(4,_03_ExponentialSearch.exponentialSearch(testone, 8));

	}
}
