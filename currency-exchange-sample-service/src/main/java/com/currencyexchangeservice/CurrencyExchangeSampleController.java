package com.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeSampleController {

	@GetMapping("/exchange/{fromCurrency}/to/{toCurrency}")
	public ExchangeValueModel retrieveExchangealue(@PathVariable String fromCurrency, @PathVariable String toCurrency) {
		BigDecimal conversionMultiple = null;
		ExchangeValueModel exchangeValue = new ExchangeValueModel();

		if (fromCurrency != null && toCurrency != null) {
			if (fromCurrency.equalsIgnoreCase("USD") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(83);
			}
			if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("USD")) {
				conversionMultiple = BigDecimal.valueOf(0.013);
			}
			if (fromCurrency.equalsIgnoreCase("EUR") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(87);
			}
			if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("EUR")) {
				conversionMultiple = BigDecimal.valueOf(0.011);
			}
			if (fromCurrency.equalsIgnoreCase("AUD") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(52);
			}
			if (fromCurrency.equalsIgnoreCase("AFN") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(1.10);
			}
			if (fromCurrency.equalsIgnoreCase("BRL") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(16.18);
			}
			if (fromCurrency.equalsIgnoreCase("JPY") && toCurrency.equalsIgnoreCase("INR")) {
				conversionMultiple = BigDecimal.valueOf(0.52);
			}
			
		}
		exchangeValue = new ExchangeValueModel(1000L, fromCurrency, toCurrency, conversionMultiple);

		return exchangeValue;

	}
}
