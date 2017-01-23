package com.rinzler;

public class MoreThanFiveItensPromotion implements Promotion{

	private Promotion nextPromotion;
	
	@Override
	public double applyDiscount(Budget budget) {	
		double discountFactor = 0.1;
		
		if (budget.getItens().size()>5){
			return budget.getValue()*discountFactor;
		}		
		return nextPromotion.applyDiscount(budget);
	}

	@Override
	public void setNext(Promotion nextPromotion) {
		this.nextPromotion = nextPromotion;
	}
}
