package com.rinzler;

public class BudgetEndState implements BudgetState{

	@Override
	public void applyDiscount(Budget budget) {
		throw new RuntimeException("The Finalized state does not get a discount. U.U");		
	}

	@Override
	public void aproves(Budget budget) {
		throw new RuntimeException("its over dude. Its finalized, no more discounts");	
	}

	@Override
	public void reproves(Budget budget) {
		throw new RuntimeException("its over dude. Its finalized, no more discounts");		
	}

	@Override
	public void ends(Budget budget) {
		throw new RuntimeException("its over dude. Its finalized, no more discounts");		
	}

}
