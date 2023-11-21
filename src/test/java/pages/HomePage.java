package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {

	public By buscarCepEndereco = By.xpath("//input[@id='relaxation']");
	Metodos metodo = new Metodos();

	public void buscarCepEndereco(String cepEndereco) {
		metodo.escrever(buscarCepEndereco, cepEndereco);
		metodo.submit(buscarCepEndereco);

	}

}
