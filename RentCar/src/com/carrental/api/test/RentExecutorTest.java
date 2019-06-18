package com.carrental.api.test;

import org.junit.Before;
import org.junit.Test;

import com.carrental.api.RentExecutor;

public class RentExecutorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExecutor() {
		
		RentExecutor executor=new RentExecutor();
		
		executor.executor();
		
	}

}
