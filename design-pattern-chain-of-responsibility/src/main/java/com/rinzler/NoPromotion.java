package com.rinzler;

public class NoPromotion implements Promotion{
	
	@Override
	public double applyDiscount(Budget budget) {
		return 0;
	}

	@Override
	public void setNext(Promotion nextPromotion) {		
	}

}
