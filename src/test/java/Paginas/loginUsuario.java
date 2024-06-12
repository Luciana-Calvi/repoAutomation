package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginUsuario {

public loginUsuario(WebDriver driver) {
		
	PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
		 
	 }

@FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div/span")
WebElement btnLogin1;

@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[1]")
WebElement btnLogin2;

@FindBy(id = "input-email")
WebElement email;

@FindBy(id = "input-password")
WebElement contrasenia;

@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input[1]")
WebElement btnLogin3;

@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[14]")
WebElement btnLogout;

@FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
WebElement msjInvalido;

public void inicioSesion(String mail, String password) {
	
	btnLogin1.click();
	
	btnLogin2.click();
	
	email.sendKeys(mail);
	contrasenia.sendKeys(password);
	
	btnLogin3.click();
	
	btnLogout.click();
	
}

public String msjNegativo() {
	
	return msjInvalido.getText();
	
}
	
}
