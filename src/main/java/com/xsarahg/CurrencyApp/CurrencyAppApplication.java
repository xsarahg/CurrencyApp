package com.xsarahg.CurrencyApp;

import com.xsarahg.CurrencyApp.model.Currency;
import com.xsarahg.CurrencyApp.model.CurrencyRepository;
import com.xsarahg.CurrencyApp.model.User;
import com.xsarahg.CurrencyApp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class CurrencyAppApplication {

	// Autowired enables dependency injection
	@Autowired private CurrencyRepository currencyRepository;

	@Autowired private UserRepository userRepository;

	public static void main(String[] args) {

		SpringApplication.run(CurrencyAppApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			// saves demo data after start application
			userRepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG"));

			currencyRepository.save(new Currency("US Dolar", "USD", new BigDecimal(100), new BigDecimal(4.52)));
			currencyRepository.save(new Currency("EURO", "EUR", new BigDecimal(300), new BigDecimal(4.52)));
		};
	}

}
