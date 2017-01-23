package com.rinzler;

public class PromotionChain {

	Promotion moreThanFiveItensPromotion = new MoreThanFiveItensPromotion();
	Promotion bigAmountPromotion = new BigAmountPromotion();
	Promotion noPromotion = new NoPromotion();
	
	public PromotionChain(){
		createTheChain();
	}
	
	private void createTheChain(){
		moreThanFiveItensPromotion.setNext(bigAmountPromotion);
		bigAmountPromotion.setNext(noPromotion);
	}
	
	public double startTheChain(Budget budget){
		return moreThanFiveItensPromotion.applyDiscount(budget);		
	}
	
}
