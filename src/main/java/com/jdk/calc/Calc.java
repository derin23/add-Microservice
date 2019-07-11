package com.jdk.calc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Calc {

@Id
@GeneratedValue
private long id;
private long num1;
private long num2;


//getters and setters

public long getNum1() {
	return num1;
}
public void setNum1(long num1) {
	this.num1 = num1;
}
public long getNum2() {
	return num2;
}
public void setNum2(long num2) {
	this.num2 = num2;
}

public Calc(long num1, long num2) {
	
	this.num1 = num1;
	this.num2 = num2;
	
}


public Calc() {

}



	
}
