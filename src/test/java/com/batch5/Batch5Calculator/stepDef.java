package com.batch5.Batch5Calculator;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	String url;
	double result;
	@Given("A REST url as {string}")
	public void a_REST_url_as(String string)throws MalformedURLException {
		url=string;
	}

	@When("invoking REST API for addition")
	public void invoking_REST_API_for_addition() {
		RestTemplate restTemplate=new RestTemplate();
		result=restTemplate.getForObject(url, Double.class);
	}

	@Then("expected result is {string}")
	public void expected_result_is(String string) {
		assertEquals(result,20,0.01);
	}


}
