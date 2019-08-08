package com.admin.controller;

import static org.junit.Assert.assertEquals;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.admin.AdminAbstractController;
import com.admin.CucumberTest;
import com.admin.model.User;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminController extends AdminAbstractController{


	User response = null;

	
	public HttpHeaders getDefaultHttpHeaders(){
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		return headers;
	}
	
	@When("^the client calls /getUser with values (\\d+)$")
	public void the_client_calls_getUser_with_values(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("arg1>>>"+arg1);
		HttpEntity<?> requestEntity=new HttpEntity<>(arg1,getDefaultHttpHeaders());
		System.out.println("requestEntity>>>"+requestEntity+">>restTemplate>>"+restTemplate);
		response = restTemplate.exchange("getUser",HttpMethod.POST,requestEntity, User.class).getBody();
	}

	@Then("^the client receives userid (\\d+)$")
	public void the_client_receives_userid(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(arg1, response.getId());
	}

	

}


