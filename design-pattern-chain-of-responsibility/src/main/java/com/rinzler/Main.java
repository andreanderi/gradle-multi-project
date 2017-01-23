package com.rinzler;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Promotion moreThanFiveItensPromotion = new MoreThanFiveItensPromotion();
		Promotion bigAmountPromotion = new BigAmountPromotion();
		Promotion noPromotion = new NoPromotion();
		
		//Creates the chain
		moreThanFiveItensPromotion.setNext(bigAmountPromotion);
		bigAmountPromotion.setNext(noPromotion);
			
		List<String> itens = new ArrayList<>();
		itens.add("donnuts");
		itens.add("ice cream");
		itens.add("shotgun");
		
		Budget budget = new Budget(666.0, itens);
		
		double discount = moreThanFiveItensPromotion.applyDiscount(budget);
		System.out.println(discount);
	}

}
