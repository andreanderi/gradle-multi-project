package com.rinzler;

public class IceKingdomDuty extends ConditionTaxTemplate{

	@Override
	public boolean useMaxTax(Budget budget) {
		return budget.getValue() > 200;
	}

	@Override
	public double getMaxTax(Budget budget) {
		return budget.getValue() * 0.4;
	}

	@Override
	public double getMinTax(Budget budget) {
		return budget.getValue() * 0.03;
	}

}
