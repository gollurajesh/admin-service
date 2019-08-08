package com.admin;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import cucumber.api.java.Before;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = {AdminApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminAbstractController {

	protected TestRestTemplate restTemplate;
	private static RestTemplateBuilder restTemplateBuilder;
	
	@BeforeClass
	public static void setUpClass() {
	    restTemplateBuilder = new RestTemplateBuilder()
	        .rootUri("http://localhost:8091/");
	}

	@Before
	public void init() {
	    restTemplate = new TestRestTemplate(restTemplateBuilder);
	    
	}
}
