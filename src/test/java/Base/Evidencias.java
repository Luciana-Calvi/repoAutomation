package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Evidencias {

	public static void tomarEvidencia(WebDriver driver, String nombreArchivo) throws IOException {

		if (driver instanceof TakesScreenshot) {
			
			TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
			File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

		} 
	}
	
}
