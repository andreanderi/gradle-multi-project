package com.rinzler;

public class Main {

	public static void main(String[] args) {
		
		Tax bubbleGumTax = new BubblegumKingdomDuty();
		Tax iceTax = new IceKingdomDuty();
		
		Budget budget = new Budget(666.0);
		
		System.out.println(bubbleGumTax.calculateTheTax(budget));
		System.out.println(iceTax.calculateTheTax(budget));
	}

}
