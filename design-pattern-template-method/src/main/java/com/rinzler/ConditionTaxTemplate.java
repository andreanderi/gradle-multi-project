package com.rinzler;

public abstract class ConditionTaxTemplate implements Tax{

	@Override
	public final double calculateTheTax(Budget budget) {
		
		if (useMaxTax(budget)){
			return getMaxTax(budget);
		}else{
			return getMinTax(budget);
		}

	}
	
	protected abstract boolean useMaxTax(Budget budget);  
	protected abstract double getMaxTax(Budget budget);
	protected abstract double getMinTax(Budget budget);
}
