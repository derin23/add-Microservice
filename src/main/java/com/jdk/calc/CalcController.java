package com.jdk.calc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

	@Autowired
	private CalcService calcService;
	
	
	private Calc calc;
	
	@GetMapping("/add/{num1}+{num2}")
	public long addNum(@PathVariable long num1,@PathVariable long num2) {
		
		
		return calcService.add(num1, num2);
		
	}
	
//	@GetMapping("/add")
//	@ResponseBody
//	public long addNum(@RequestParam long x, @RequestParam long y) {
//
//		
//		return calcService.add(x,y);
		
//	}
}
