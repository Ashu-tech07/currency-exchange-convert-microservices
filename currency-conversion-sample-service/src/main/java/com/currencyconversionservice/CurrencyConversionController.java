package com.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	@GetMapping("/convert/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String fromCurrency,@PathVariable String toCurrency, @PathVariable BigDecimal quantity)
	{
		Map<String,String> uriVariables= new HashMap<>();
		uriVariables.put("fromCurrency", fromCurrency);
        uriVariables.put("toCurrency", toCurrency);
        
        ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange-sample/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}",
                CurrencyConversionBean.class,
                uriVariables);
        CurrencyConversionBean response= responseEntity.getBody();
        return new CurrencyConversionBean(
                response.getId(), fromCurrency, toCurrency,
                response.getConversionMultiple(), quantity,
                quantity.multiply(response.getConversionMultiple()));
        
	}

	
}
