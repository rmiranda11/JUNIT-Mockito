package com.junitmockito.testingpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathTest {

	@Test
	public void sumOfAllNumbers() {
		Math math = new Math();
		
		int result = math.sum(new int[] {1,3,5});
		
		System.out.println(result);
		
		assertEquals(9,result);
	}
	
	@Test
	public void testFailure() {
		Math math = new Math();
		
		int result = math.sum(new int[] {2,4,6});
		
		System.out.println(result);
		
		assertEquals(10, result);
	}
}
