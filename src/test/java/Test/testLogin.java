package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Evidencias;
import Base.setUp;
import Paginas.loginUsuario;



public class testLogin extends setUp {

	loginUsuario usuario;
	Evidencias evidencias;
	
	@Test(priority = 1)
	public void loginPositivo() throws Exception  {
		
		try {
						
			usuario = new loginUsuario(driver);
			usuario.inicioSesion("lucalvi64@gmail.com", "123456");
						
		}catch(Exception e) {
			
			System.out.println("No pudo iniciar sesion");
			
		}
		
	}
	
	@Test(priority = 2)
	public void loginNegativo() throws Exception  {
					
		    evidencias = new Evidencias();
		    
			usuario = new loginUsuario(driver);
			usuario.inicioSesion("la_lu101@gmail.com", "123456");
			Assert.assertEquals(usuario.msjNegativo(),"Warning: No match for E-Mail Address and/or Password.");
			
			evidencias.tomarEvidencia(driver, "caso de prueba negativa");
			
	}
	
}
