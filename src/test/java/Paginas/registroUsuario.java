package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registroUsuario {

	public registroUsuario(WebDriver driver) {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
		 
	 }
	
	@FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span")
	WebElement btnRegister1;
	
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[2]")
	WebElement btnRegister;
	
	@FindBy(id = "input-firstname")
	WebElement name;
	
	@FindBy(id = "input-lastname")
	WebElement lastName;
	
	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy(id = "input-telephone")
	WebElement phone;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(id = "input-confirm")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/div[2]/label")
	WebElement btnSubcribe;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/div")
	WebElement privacidad;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input")
	WebElement continuee;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/h2")
	WebElement mensaje;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/a")
	WebElement continue2;
	
	@FindBy(css ="form-text text-muted")
	WebElement advertencia;
	
	public void completarFormulario(String nombre, String apellido, String mail,  String telefono, String contrasenia, String repContrasenia ) {
		
		btnRegister1.click();
		
		btnRegister.click();
		
		name.sendKeys(nombre);
		lastName.sendKeys(apellido);
		email.sendKeys(mail);
		phone.sendKeys(telefono);
		password.sendKeys(contrasenia);
		confirmPassword.sendKeys(repContrasenia);
		
		btnSubcribe.click();
		
		privacidad.click();
		
		continuee.click();
		
		continue2.click();
		
	}
	
	public String Title() {
   	
		return mensaje.getText();
		
   }
	
	public String getInvalido() {
		
		return advertencia.getText();
		
	}
	
}
