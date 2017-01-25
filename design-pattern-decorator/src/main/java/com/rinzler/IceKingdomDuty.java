package com.rinzler;

public class IceKingdomDuty extends Tax{

	private double dutyMultiplier = 0.2;
	
	public IceKingdomDuty(Tax anotherTax){
		super(anotherTax);
	}
	
	@Override
	public double calculateTheTax(Budget budget) {
		return budget.getValue()*dutyMultiplier+ calculateAnotherTax(budget);
	}

}
