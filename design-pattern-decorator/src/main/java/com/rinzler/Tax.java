package com.rinzler;

public abstract class Tax {
	
	private final Tax anotherTax;
	
	public Tax(){
		this.anotherTax=null;
	}
	
	public Tax(Tax anotherTax){
		this.anotherTax=anotherTax;
	}
	
	protected double calculateAnotherTax(Budget budget){
		return anotherTax==null?0:anotherTax.calculateTheTax(budget);
	}
	
	public abstract double calculateTheTax(Budget budget);
}
