package com.rinzler;

public class PrinterAction implements InvoiceAction{

	@Override
	public void executesTheAction(Invoice invoice) {
		System.out.println("this method should print the invoice");	
	}

}
