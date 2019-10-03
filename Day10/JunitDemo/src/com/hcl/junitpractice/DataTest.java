package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	@Test
	public void testNullEx() {
		Data objData=null;
	
		assertEquals(5,objData.sum(2, 3));
	}
	@Test
	public void testDiv(){
		Data objData=new Data();
		assertEquals(2, objData.div(5,2));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivEx(){
		Data objData=new Data();
		objData.div(5,0);
	}
	@Test
	public void testGetProperyTest() {
		Data objData=new Data();
		assertNotNull(objData.getPropertyTest("bhargav"));
		assertNull(objData.getPropertyTest("tushar"));
	}
	@Test
	public void testEven() {
		Data objData=new Data();
		assertTrue(objData.even(8));
		assertFalse(objData.even(11));
	}
	@Test
	public void testMinArray() {
		Data objData=new Data();
		int x[]={1,2,0,4,5};
		assertEquals(0, objData.minArray(x));
	}
	@Test
	public void testMax3() {
		Data objData=new Data();
		assertEquals(5, objData.max3(5,2,2));
		assertEquals(5, objData.max3(1,5,3));
		assertEquals(5, objData.max3(1,3,5));
	}
	@Test
	public void testSum() {
		Data objData=new Data();
		assertEquals(4, objData.sum(2, 2));
		assertEquals(4, objData.sum(1, 3));
	}

	@Test
	public void testSayHello() {
		Data objData=new Data();
		assertEquals("welcome to junit",objData.sayHello());
		
	}

}
