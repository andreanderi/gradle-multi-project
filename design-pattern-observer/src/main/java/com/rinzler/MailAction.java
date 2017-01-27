package com.rinzler;

public class MailAction implements InvoiceAction{

	@Override
	public void executesTheAction(Invoice Invoice) {
		System.out.println("this method soudl send the invoice by mail");
	}
	

}
