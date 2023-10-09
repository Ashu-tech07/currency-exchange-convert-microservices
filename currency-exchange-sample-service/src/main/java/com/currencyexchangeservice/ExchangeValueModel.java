package com.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Exchange_Value")
public class ExchangeValueModel {
	@Id @Column(name = "id") private Long id;
	@Column(name="from_currency") private String fromCurrency;
	@Column(name="to_currency") private String toCurrency;
	@Column(name="conversion_multiple") private BigDecimal conversionMultiple;
	
	
	public ExchangeValueModel() {}

	public ExchangeValueModel(Long id, String fromCurrency, String toCurrency, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}


	public String getFromCurrency() {
		return fromCurrency;
	}


	public String getToCurrency() {
		return toCurrency;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	

	
	

}
