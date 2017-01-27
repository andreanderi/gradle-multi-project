package com.rinzler;

public class Budget {
	
	protected double value;
	protected BudgetState currentState;
	
	public Budget(double value){
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	public void applyDiscount(){
		currentState.applyDiscount(this);
	}
	
	public void aproves(){
		currentState.aproves(this);
	}
	
	public void reproves(){
		currentState.reproves(this);
	}
	
	public void ends(){
		currentState.ends(this);
	}
}
