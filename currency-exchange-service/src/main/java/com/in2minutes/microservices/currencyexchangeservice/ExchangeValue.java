package com.in2minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

	public ExchangeValue() {
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

}
