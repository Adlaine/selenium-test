package br.com.jumptreinamentos.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import io.restassured.path.json.JsonPath;
import java.util.Map;

import org.junit.Assert;

import br.com.jumptreinamentos.util.BaseRestService;

public class RestCustomerSteps {

	private String endpoint;
	BaseRestService baseRestService = new BaseRestService();

	@Dado("^o endpoint Customers do Fruit Shop API$")
	public void oEndpointCustomersDoFruitShopAPI() throws Throwable {
		endpoint = "https://api.predic8.de:443/shop/customers";
	}

	@Quando("^o usuario buscar o cliente \"([^\"]*)\"$")
	public void oUsuarioBuscarOCliente(String id) throws Throwable {
		baseRestService.response = baseRestService.request.get(endpoint + "/" + id);
	}

	@Então("^o endpoint Customers retorará$")
	public void oEndpointCustomersRetorará(DataTable data) throws Throwable {
		for (Map<Object, Object> map : data.asMaps(String.class, String.class)) {
			JsonPath jsonPath = baseRestService.response.jsonPath();
			Assert.assertEquals(map.get("firstname"), jsonPath.get("firstname"));
			Assert.assertEquals(map.get("lastname"), jsonPath.get("lastname"));

		}
	}

}
