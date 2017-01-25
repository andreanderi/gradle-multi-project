package com.rinzler;

public class Main {

	public static void main(String[] args) {
		
		Tax bubbleGumTax = new BubblegumKingdomDuty();
		Tax iceWithBubblegum = new IceKingdomDuty(new BubblegumKingdomDuty());
		
		Budget budget = new Budget(666.0);
		
		System.out.println(bubbleGumTax.calculateTheTax(budget));
		System.out.println(iceWithBubblegum.calculateTheTax(budget));

	}

}
