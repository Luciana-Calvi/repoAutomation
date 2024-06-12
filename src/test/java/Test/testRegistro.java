package Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.setUp;
import Paginas.registroUsuario;

public class testRegistro extends setUp  {
	
	registroUsuario usuario;
	
	@Test(priority = 1)
	public void registroPositivo() throws Exception  {
		
		try {
			
			usuario = new registroUsuario(driver);
			usuario.completarFormulario("Luciana", "Calvi", "micorreo"+Math.random()+"@correo.com", "2613338546","54321", "54321");
			Assert.assertEquals(usuario.Title(),"My Account");
			
			System.out.println("Registro exitoso");
						
		}catch(Exception e) {
			
			System.out.println("No se pudo registrar");
			
		}
		
	}
	
	@Test(priority = 2)
	public void registroNegativo() throws Exception  {
				
		try {
			
			usuario = new registroUsuario(driver);
			usuario.completarFormulario("Luciana", "Calvi", "micorreo"+Math.random()+"@correo.com", " ","54321", "54321");
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.titleIs(Assert.assertEquals(usuario.getInvalido(),"Enter valid phone number with country code!")));
			
			//Assert.assertEquals(usuario.getInvalido(),"Enter valid phone number with country code!");
			
			System.out.println("Caso negativo exitoso");
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Caso negativo fallido");
			
		}
	}
}
		


