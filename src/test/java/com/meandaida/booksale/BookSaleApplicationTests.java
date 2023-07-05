package com.meandaida.booksale;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookSaleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(BookSaleApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing started......");
		assertEquals(true,true);
	}

}
