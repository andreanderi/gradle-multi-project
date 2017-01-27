package com.rinzler;

public class Main {

	public static void main(String[] args) {	
		Budget budget = new Budget(100);
		budget.currentState = new BudgetProcessingState();
		
		budget.applyDiscount();
		
		System.out.println(budget.getValue());
		
		budget.aproves();
		budget.applyDiscount();
		
		System.out.println(budget.getValue());
		
		budget.ends();
	}

}
