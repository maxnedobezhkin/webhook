package com.project.webhook.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Option {
	private String option;
	private String variant;
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	@Override
	public String toString() {
		return option + ":" + variant;
	}
	
	
}
