package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Reusable_methods.Generic_Methods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browser extends Generic_Methods {


	public WebDriver launchurl() throws IOException {
		
		
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Allparts\\src\\main\\resources\\configure.properties");
		p.load(file);
		String Url = p.getProperty("url");
		String Browsername = p.getProperty("browser");
		
		if(Browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver();
			driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.edgedriver();
			driver=new FirefoxDriver();
		}
		
		driver.get(Url);
		driver.manage().window().maximize();
		
		return driver;
	}
}
