package br.com.jumptreinamentos.steps;

import java.util.Map;

import br.com.jumptreinamentos.pageobjects.NacionalidadePage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;

public class NacionalidadeSteps {

	NacionalidadePage nacionalidade = new NacionalidadePage();

	@Quando("o usuario inserir uma nacionalidade")
	public void oUsuarioInserirUmaNacionalidade(DataTable data) {
		for (Map<Object, Object> map : data.asMaps(String.class, String.class)) {
			nacionalidade.adicionaNacionalidade(map.get("nacionalidade").toString());
		}
	}

	@Então("a nacionalidade foi inserida com sucesso")
	public void aNacionalidadeFoiInseridaComSucesso(DataTable dataTable) {
		for (Map<Object, Object> map : dataTable.asMaps(String.class, String.class)) {
			nacionalidade.validadaInclusaoNacionalidade(map.get("nacionalidade").toString());
		}
	}

	@Quando("^o usuario excluir uma nacionalidade$")
	public void oUsuarioExcluirUmaNacionalidade(DataTable nac) throws Throwable {
		for (Map<Object, Object> map : nac.asMaps(String.class, String.class)) {
			nacionalidade.excluirNacionalidade(map.get("nacionalidade").toString());
		}
	}

	@Então("^a nacionalidade foi excluida com sucesso$")
	public void aNacionalidadeFoiExcluidaComSucesso(DataTable nac) throws Throwable {
		for (Map<Object, Object> map : nac.asMaps(String.class, String.class)) {
			nacionalidade.excluirNacionalidade(map.get("nacionalidade").toString());
		}
	}

}
