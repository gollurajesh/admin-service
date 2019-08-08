package com.admin;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AdminApplicationTests {
	
	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void index() throws RestClientException, MalformedURLException {
		ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/user/index").toString(), String.class);
			
	        assertEquals("Spring Boot Admin Example", response.getBody());
	}

}
