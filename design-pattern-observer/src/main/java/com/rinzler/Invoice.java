package com.rinzler;

import java.util.Date;
import java.util.List;

public class Invoice {
	
	private double value;
	private String address;
	private Date dueDate;
	private String paymentResponsible;
	private List<InvoiceItem> invoiceItens;
	
	public Invoice(double value, String address, Date dueDate, String paymentResponsible,
			List<InvoiceItem> invoiceItens) {
		super();
		this.value = value;
		this.address = address;
		this.dueDate = dueDate;
		this.paymentResponsible = paymentResponsible;
		this.invoiceItens = invoiceItens;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentResponsible() {
		return paymentResponsible;
	}
	public void setPaymentResponsible(String paymentResponsible) {
		this.paymentResponsible = paymentResponsible;
	}
	public List<InvoiceItem> getInvoiceItens() {
		return invoiceItens;
	}
	public void setInvoiceItens(List<InvoiceItem> invoiceItens) {
		this.invoiceItens = invoiceItens;
	}
	

}
