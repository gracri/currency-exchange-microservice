package com.in2minutes.microservices.limitservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	
	protected LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
}
