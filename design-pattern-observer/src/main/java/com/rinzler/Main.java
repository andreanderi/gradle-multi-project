package com.rinzler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<InvoiceAction> actions = new ArrayList<>();
		actions.add(new MailAction());
		actions.add(new PrinterAction());
		
		InvoiceBuilder invoiceBuilder = new InvoiceBuilder(actions);
			
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
