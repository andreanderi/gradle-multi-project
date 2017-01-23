package com.rinzler;

public class BigAmountPromotion implements Promotion{

private Promotion nextPromotion;
	
	@Override
	public double applyDiscount(Budget budget) {	
		double discountFactor = 0.2;

		if (budget.getValue()>500.0){
			return budget.getValue()*discountFactor;
		}		
		return nextPromotion.applyDiscount(budget);
	}

	@Override
	public void setNext(Promotion nextPromotion) {
		this.nextPromotion = nextPromotion;
	}

}
