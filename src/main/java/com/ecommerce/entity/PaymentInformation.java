package com.ecommerce.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PaymentInformation {
	
	private String cardHolderName;
	private String cardNumber;
	private String expirationDate;
	private String cvv;
	
	
}
