package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class setUp {
	
	public static WebDriver driver = null;
	
	@BeforeMethod
    public void initialize() throws IOException {
        
    
        
        String urlWeb="https://ecommerce-playground.lambdatest.io/";
        String driverPath="..\\LamdaTest\\Drivers\\chromedriver.exe";
       // String PATHF="..\\LamdaTest\\Drivers\\geckodriver.exe";
        
        System.out.println(urlWeb); 
        System.out.println(driverPath);
        //System.out.println(PATHF);
       
        System.setProperty("webdriver.chrome.driver",driverPath);
        //System.setProperty("webdriver.gecko.driver",PATHF);
	
		driver= new ChromeDriver();	
		//driver= new FirefoxDriver();
    
        // To maximize browser
        driver.manage().window().maximize();
    
        // To open  site
        driver.get(urlWeb);
    }
  
    @AfterMethod
    // Test cleanup
    public void TeardownTest() {
        
    	//setUp.driver.quit();
    
    }
}
