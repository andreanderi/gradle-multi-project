package com.rinzler;

public class BudgetProcessingState implements BudgetState{

	@Override
	public void applyDiscount(Budget budget) {
		budget.value -= budget.value * 0.10;
	}

	@Override
	public void aproves(Budget budget) {
		budget.currentState = new BudgetApprovedState();	
	}

	@Override
	public void reproves(Budget budget) {
		budget.currentState = new BudgetReprovedState();		
	}

	@Override
	public void ends(Budget budget) {
		throw new RuntimeException("Processing State cannot finalize.");	
	}
}
