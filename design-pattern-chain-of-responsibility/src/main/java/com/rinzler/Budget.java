package com.rinzler;

import java.util.ArrayList;
import java.util.List;

public class Budget {
	
	public Budget(double value, List<String> itens){
		this.value = value;
		this.itens = itens;
	}
	
	private double value;
	private List<String> itens = new ArrayList<>();
	
	public double getValue() {
		return value;
	}

	public List<String> getItens() {
		return itens;
	}

}
