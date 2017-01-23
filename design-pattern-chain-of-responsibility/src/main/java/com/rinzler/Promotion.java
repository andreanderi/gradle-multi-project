package com.rinzler;

public interface Promotion {
	double applyDiscount(Budget budget);
	void setNext(Promotion nextPromotion);
}
