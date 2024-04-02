package com.lab2.lab2;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab2ApplicationTests {


	@Autowired
	private DataController dataController;

	@Test
	public void health() {
		String response = dataController.healthCheck();
		assertEquals("APLICACION FUNCIONANDO OK!", response);
	}

	@Test
	public void version() {
		String response = dataController.version();
		assertEquals("La version Actual es 1.0.0", response);
	}

	@Test
	public void nationLength() {
		JsonNode response = dataController.getRandomNations();
		assertEquals(20, response.size());
	}

	@Test
	public void currencyLength() {
		JsonNode response = dataController.getRandomCurrencies();
		assertEquals(20, response.size());
	}

	@Test
	public void airlinesLength() {
		JsonNode response = dataController.getRandomAirlines();
		assertEquals(20, response.size());
	}
}
