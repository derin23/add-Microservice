package com.jdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jdk.calc.Calc;
import com.jdk.calc.CalcService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalcApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
//	
	@Autowired
	private CalcService calcService;
	
	
	@Test
	public void takeLong() {
		Calc calc = new Calc(2,2222);
		
		assertEquals("should return long", 2,calc.getNum1());
		assertEquals("should return long", 2222,calc.getNum2());
		
	}
	
	@Test
	public void testControllerAdd() {
		assertEquals("should return sum",4,calcService.add(2,2));
		assertEquals("should return sum",40000,calcService.add(20000,20000));
	}
	
	
	
}
