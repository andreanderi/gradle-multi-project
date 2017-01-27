package com.rinzler;

public interface BudgetState {
	
	void applyDiscount(Budget budget);
	
	void aproves(Budget budget);
	void reproves(Budget budget);
	void ends(Budget budget);
}
