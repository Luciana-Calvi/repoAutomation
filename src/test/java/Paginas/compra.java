package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class compra {

	public compra(WebDriver driver) {
		
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
	
	@FindBy(xpath = "//*[@id=\"entry_217832\"]/a")
	WebElement btnCategoria;
	
	@FindBy(xpath = "//*[@id=\"widget-navbar-217841\"]/ul/li[2]/a")
	WebElement btnCamara;
	
	@FindBy(xpath = "//*[@id=\"mz-product-grid-image-28-212408\"]/div/div[1]/img")
	WebElement btnCart;
	
	@FindBy(xpath = "//*[@id=\"entry_216843\"]/button")
	WebElement btnBuy;
	
	
	
	@FindBy(xpath = "//*[@id=\"form-checkout\"]/div/div[2]/div/div[5]/label")
	WebElement condiciones;
	
	@FindBy(id = "button-save")
	WebElement btnContinue;
	
	@FindBy(id = "button-confirm")
	WebElement btnConfirmacionCompra;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement mensaje;
	
	public void realizarCompra(String mail, String password) {
		
		btnLogin1.click();
		
		btnLogin2.click();
		
		email.sendKeys(mail);
		contrasenia.sendKeys(password);
		
		btnLogin3.click();
		
		btnCategoria.click();
		
		btnCamara.click();
		
		btnCart.click();
		
		btnBuy.click();
		
		condiciones.click();
		
		btnContinue.click();
		
		btnConfirmacionCompra.click();
				
	}
	
	public String compraExitosa() {
		
		return mensaje.getText();
		
	}
	
}


