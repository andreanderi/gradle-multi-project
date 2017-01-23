package com.rinzler;

public class BubblegumKingdomDuty implements Tax{

	private double dutyMultiplier = 0.02;
	
	@Override
	public double calculateTheTax(Budget budget) {
		return budget.getValue()*dutyMultiplier;
	}
}
