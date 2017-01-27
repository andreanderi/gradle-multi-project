package com.rinzler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceBuilder {

	private double value;
	private String address;
	private Date dueDate;
	private String paymentResponsible;
	private List<InvoiceItem> invoiceItens = new ArrayList<>();
	private List<InvoiceAction> invoiceActionsToRun = new ArrayList<>();
	
	public InvoiceBuilder() {
		this.dueDate = new Date();
	}

	public InvoiceBuilder withValue(double value){
		this.value = value;
		return this;
	}
	
	public InvoiceBuilder withAddress(String address){
		this.address = address;
		return this;
	}
	
	public InvoiceBuilder withDueDate(Date dueDate){
		this.dueDate = dueDate;
		return this;
	}
	
	public InvoiceBuilder withPaymentResponsible(String paymentResponsible){
		this.paymentResponsible = paymentResponsible;
		return this;
	}
	
	public InvoiceBuilder with(InvoiceItem newItem){
		invoiceItens.add(newItem);
		return this;
	}
	
	public Invoice build(){
		Invoice invoice = new Invoice(value, address, dueDate, paymentResponsible, invoiceItens);
		
		for (InvoiceAction action: invoiceActionsToRun){		
			action.executesTheAction(invoice);		
		}
		
		return invoice;	
	}	
	
	public void addActionsToRun(InvoiceAction action){
		invoiceActionsToRun.add(action);
	}
	
	
}
