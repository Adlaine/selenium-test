package br.com.jumptreinamentos.util;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseRestService {
	public Response response;
	public RequestSpecification request;
	public BaseRestService() {
		super();
		request = RestAssured.given();
	}


}

