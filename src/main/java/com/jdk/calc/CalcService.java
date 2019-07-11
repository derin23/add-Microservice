package com.jdk.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

	public long add(long num1,long num2) {
		
		long total = num1 + num2;
		
		return total;
		
	}
	
}
