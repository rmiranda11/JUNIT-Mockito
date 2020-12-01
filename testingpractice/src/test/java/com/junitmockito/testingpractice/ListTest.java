package com.junitmockito.testingpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	@Test
	public void test() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
		
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(30, listMock.size());
		
	}
	
	@Test
	public void testGetSpecificParameter() {
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("Yo");
		assertEquals("Yo", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testGetGenericParameter() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("Winter is coming").thenReturn("Chicago is winter");
		assertEquals("Winter is coming", listMock.get(0));
		assertEquals("Chicago is winter", listMock.get(1));
	}
}
