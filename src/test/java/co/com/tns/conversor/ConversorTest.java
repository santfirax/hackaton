package co.com.tns.conversor;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ConversorTest {
	@Test
	public void debeValidarSiElPrimerCaracterNoSeaEspacio(){
		//Arrange, inicializo
				ConvertirHtml convertirHtml = new ConvertirHtml();
				//Act
				List<String> header = convertirHtml.convertir("# Hola");
				//Assert
				Assert.assertTrue((header != null) && (header.size() > 1));
		
	}
	@Test
	public void debeValidarTamanoDeLaCadena() {
		//Arrange
		ConvertirHtml convertirHtml = new ConvertirHtml();
		//act
		String header = "######";
		//assert
		Assert.assertTrue(convertirHtml.validarTamanoDeLaCadena(header));
		
		
		
	}
	@Test
	public void debeContarNumeroDeNumerales() {
		//Arrange
		ConvertirHtml convertirHtml = new ConvertirHtml();
		//act
		String header = "##";
		//assert
		Assert.assertTrue(convertirHtml.contarNumeroDeNumerales(header));
	}
	@Test
	public void debeMostrarEtiqueta() {
		//Arrange
		ConvertirHtml convertirHtml = new ConvertirHtml();
		//act
		String header = "#######Hackaton";
		//assert
		Assert.assertTrue(1==convertirHtml.MostrarEtiqueta(header));
	}
	
	

}
