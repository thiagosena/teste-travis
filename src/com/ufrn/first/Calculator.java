package com.ufrn.first;

public class Calculator {
	
	public int multiply(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x * y;
	  }
	  
	public int add(int x, int y){
		return x + y;
	}
}
