package com.rinzler;

public class BudgetApprovedState implements BudgetState{

	@Override
	public void applyDiscount(Budget budget) {
		budget.value -= budget.value * 0.5;
	}

	@Override
	public void aproves(Budget budget) {
		throw new RuntimeException("Its alread approved. it Cannot be approved twice!");	
	}

	@Override
	public void reproves(Budget budget) {
		throw new RuntimeException("It cannot be reproved since it is approved.");
	}

	@Override
	public void ends(Budget budget) {
		budget.currentState = new BudgetEndState();
	}

}
