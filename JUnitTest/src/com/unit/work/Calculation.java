package com.unit.work;

/**
 * 
 * @author Ravi
 *
 */
public class Calculation {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a%b;
	}
	
	public int calculate(int a, int b) {
		return add(a,b) - subtract(a,b);
	}
}//end of the class
