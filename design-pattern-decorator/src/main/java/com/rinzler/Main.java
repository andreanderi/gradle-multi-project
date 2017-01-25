package com.rinzler;

public class Main {

	public static void main(String[] args) {
		
		Tax bubblegumWithIce = new BubblegumKingdomDuty(new IceKingdomDuty());
		Tax iceWithBubblegum = new IceKingdomDuty(new BubblegumKingdomDuty());
		
		Budget budget = new Budget(666.0);
		
		System.out.println(bubblegumWithIce.calculateTheTax(budget));
		System.out.println(iceWithBubblegum.calculateTheTax(budget));

	}

}
