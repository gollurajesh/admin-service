package com.admin;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",plugin= {"html:target/cucumber-report"})
//@SpringBootTest(classes = AdminApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
//@ContextConfiguration
public class CucumberTest {

	
}
