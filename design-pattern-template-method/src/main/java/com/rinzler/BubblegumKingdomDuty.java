package com.rinzler;

public class BubblegumKingdomDuty extends ConditionTaxTemplate{

	@Override
	public boolean useMaxTax(Budget budget) {
		return budget.getValue() > 500;
	}

	@Override
	public double getMaxTax(Budget budget) {
		return budget.getValue() * 0.2;
	}

	@Override
	public double getMinTax(Budget budget) {
		return budget.getValue() * 0.02;
	}
}
