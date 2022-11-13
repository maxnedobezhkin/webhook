package com.project.webhook.entity;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeOrder {
	
	private String ma_email;
	private Payment payment;
	private String test;
	
	
	public IncomeOrder() {
		super();
	}
	
	
	public IncomeOrder(String ma_email, Payment payment, String test) {
		super();
		this.ma_email = ma_email;
		this.payment = payment;
		this.test = test;
	}


	public IncomeOrder(String ma_email, Payment payment) {
		super();
		this.ma_email = ma_email;
		this.payment = payment;
	}


	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getMa_email() {
		return ma_email;
	}
	public void setMa_email(String ma_email) {
		this.ma_email = ma_email;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "IncomeOrder [ma_email=" + ma_email + ", payment=" + payment + "]";
	}
	
	
	
	
}
