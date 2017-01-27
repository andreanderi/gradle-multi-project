package com.rinzler;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
		invoiceBuilder.addActionsToRun(new MailAction());
		invoiceBuilder.addActionsToRun(new PrinterAction());
				
		Invoice invoice = invoiceBuilder.withAddress("sesame street 666")
				.withDueDate(new Date())
				.with(new InvoiceItem("chips", 13))
				.with(new InvoiceItem("ice cream", 13))
				.withPaymentResponsible("Finn the human")
				.withValue(666)
				.build();
		
		System.out.println(invoice.getValue());

	}

}
