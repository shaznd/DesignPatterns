package com.calculator;

public class CalculateFactory {
	
	public Calculate getCalculate(String type) {
		
		
		Calculate calculateObj = null;
		if (type.toLowerCase().equals( "add") ) {
			calculateObj = new Add();
		}
		else if (type.toLowerCase().equals( "sub") ) {
			calculateObj = new Subtract();
		}
		else if (type.toLowerCase().equals( "mul") ) {
			calculateObj = new Multiply();
		}
		else if (type.toLowerCase().equals( "div") ) {
			calculateObj = new Divide();
		}
		else {
			System.out.println("we dont do that");
		}
		
		return calculateObj;
	}

}
