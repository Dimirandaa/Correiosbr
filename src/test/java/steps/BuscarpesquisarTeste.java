package steps;

import config.IniciarlizarTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import pages.ResultadoBuscaPage;

public class BuscarpesquisarTeste {
	HomePage home = new HomePage();
	ResultadoBuscaPage resultado = new ResultadoBuscaPage();

	@Given("que esteja na tela inicial")
	public void queEstejaNaTelaInicial() {
		IniciarlizarTest.abrirNavegador();

	}

	@When("pesquisar o cep desejado")
	public void pesquisarOCepDesejado() {
		home.buscarCepEndereco("04854-010");
	}

	@Then("valido as informacoes de retorno")
	public void validoAsInformaçõesDeRetorno() {
		resultado.validarBuscarCepEndereco("Rua Autilio de Oliveira", "Chácara Cocaia", "São Paulo/SP", "04854-010");
	}

}
