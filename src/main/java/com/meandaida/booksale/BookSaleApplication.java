package com.meandaida.booksale;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookSaleApplication {

	public static Logger logger = LoggerFactory.getLogger(BookSaleApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started form MAIL CLASS....");
	}
	public static void main(String[] args) {
		logger.info("Application executed form MAIL METHOD....");
		SpringApplication.run(BookSaleApplication.class, args);
	}

}
