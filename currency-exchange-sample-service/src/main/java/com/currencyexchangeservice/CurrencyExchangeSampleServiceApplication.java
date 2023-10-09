package com.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CurrencyExchangeSampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeSampleServiceApplication.class, args);
	}

}
