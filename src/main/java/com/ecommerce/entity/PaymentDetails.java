package com.ecommerce.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PaymentDetails {
	
	private String paymentMethod;
	private String status;
	private String paymentId;
	private String razorPaymentLinkId;
	private String razorPaymentLinkReferenceId;
	private String razorPaymentLinkStatus;
	private String razorPaymentId;
	
	
}
