package com.rinzler;

public abstract class ConditionTaxTemplate implements Tax{

	@Override
	public double calculateTheTax(Budget budget) {
		
		if (useMaxTax(budget)){
			return getMaxTax(budget);
		}else{
			return getMinTax(budget);
		}

	}
	
	public abstract boolean useMaxTax(Budget budget);  
	public abstract double getMaxTax(Budget budget);
	public abstract double getMinTax(Budget budget);
}
