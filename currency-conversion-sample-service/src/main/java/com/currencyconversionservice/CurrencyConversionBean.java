package com.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal ConversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	
	public CurrencyConversionBean() {}

	public CurrencyConversionBean(Long id, String fromCurrency, String toCurrency, BigDecimal conversionMultiple,
			BigDecimal quantity, BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		ConversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getConversionMultiple() {
		return ConversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
	
	

}
