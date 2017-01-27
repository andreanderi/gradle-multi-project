package com.rinzler;

public class BudgetProcessingState implements BudgetState{

	private boolean alreadHasThisDiscount = false;
	
	@Override
	public void applyDiscount(Budget budget) {
		if (!alreadHasThisDiscount){
			budget.value -= budget.value * 0.10;
			alreadHasThisDiscount = true;
		}else{
			throw new RuntimeException("no double discounts for this state, young lady!");	
		}
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
