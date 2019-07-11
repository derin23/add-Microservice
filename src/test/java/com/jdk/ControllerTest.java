package com.jdk;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jdk.calc.CalcController;


public class ControllerTest {

	@Autowired
	private CalcController calcController;
	


	@Test
	public void testControllerAdd() {
		assertEquals(3,calcController.addNum(1, 2));
		assertNotNull(calcController.addNum(1, 2));
	
	}

}