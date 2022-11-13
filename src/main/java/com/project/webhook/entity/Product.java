package com.project.webhook.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public class Product {
	private String name;
	private int quantity;
	private int amount;
	private String externalid;
	private String price;
	private Option[] options;
	
	public Product() {
		super();
	}


	public Product(String name, int quantity, int amount, String externalid, String price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.amount = amount;
		this.externalid = externalid;
		this.price = price;
	}


	public Product(String name, int quantity, int amount, String externalid, String price, Option[] options) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.amount = amount;
		this.externalid = externalid;
		this.price = price;
		this.options = options;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getExternalid() {
		return externalid;
	}
	public void setExternalid(String externalid) {
		this.externalid = externalid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	@Override
	public String toString() {
		if (this.getOptions() != null) {
			List<Option> list = new ArrayList<Option>(Arrays.asList(getOptions()));
			StringBuilder items = new StringBuilder();
			items.append("(");
			for (Option option : list) {
				items.append(option.toString());
			}
			items.append(")");
			return name + items.toString() + " - " + quantity + "X" + price + "=" + amount + ";";
		} else {
			return name + " - " + quantity + "X" + price + "=" + amount + ";";
		}
	}
}
