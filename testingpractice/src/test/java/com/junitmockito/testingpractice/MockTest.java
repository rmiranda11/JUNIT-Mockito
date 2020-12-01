package com.junitmockito.testingpractice;

import static org.mockito.Mockito.when;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	BusinessImpl businessImpl;
	
	@Test 
	public void FindGreatest() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {9,20,27});
		
		int result =  businessImpl.findGreatest();
		
		System.out.println(result);
			
		assertEquals(27, result);
	}
	
	@Test
	public void FindOne() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {101});
		
		int result = businessImpl.findGreatest();
		
		System.out.println(result);
		
		assertEquals(101, result);
	}
	
	@Test
	public void FindNone() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		int result = businessImpl.findGreatest();
		
		System.out.println(result);
		
		assertEquals(Integer.MIN_VALUE, result);
	}
}
