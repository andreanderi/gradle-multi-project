package com.rinzler;

public class BudgetApprovedState implements BudgetState{

	private boolean alreadHasThisDiscount = false;
	
	@Override
	public void applyDiscount(Budget budget) {
		
		if (!alreadHasThisDiscount){
			budget.value -= budget.value * 0.5;
			alreadHasThisDiscount = true;
		}else{
			throw new RuntimeException("no double discounts for this state, young lady!");	
		}
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
