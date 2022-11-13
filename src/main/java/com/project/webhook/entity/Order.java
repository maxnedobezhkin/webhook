package com.project.webhook.entity;

import java.util.Date;

import lombok.AllArgsConstructor;


public class Order {
	private String count;
	private String date;
	private String email;
	private String id;
	private String items;
	
	
	
	public Order() {
		super();
	}
	public Order(String count, String date, String email, String id, String items) {
		super();
		this.count = count;
		this.date = date;
		this.email = email;
		this.id = id;
		this.items = items;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	

}
