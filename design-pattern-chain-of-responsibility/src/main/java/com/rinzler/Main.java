package com.rinzler;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> itens = new ArrayList<>();
		itens.add("donnuts");
		itens.add("ice cream");
		itens.add("shotgun");
		
		Budget budget = new Budget(666.0, itens);
		PromotionChain chain = new PromotionChain();
		
		double discount = chain.startTheChain(budget);
		System.out.println(discount);
	}

}
