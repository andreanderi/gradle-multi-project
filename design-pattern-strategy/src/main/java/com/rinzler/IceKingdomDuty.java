package com.rinzler;

public class IceKingdomDuty implements Tax{

	private double dutyMultiplier = 0.2;
	
	@Override
	public double calculateTheTax(Budget budget) {
		return budget.getValue()*dutyMultiplier;
	}

}
