package com.rinzler;

public class BubblegumKingdomDuty extends Tax{

	private double dutyMultiplier = 0.02;
	
	/*public BubblegumKingdomDuty(Tax anotherTax){
		super(anotherTax);
	}*/
	
	@Override
	public double calculateTheTax(Budget budget) {
		return budget.getValue()*dutyMultiplier+ calculateAnotherTax(budget);
	}
}
