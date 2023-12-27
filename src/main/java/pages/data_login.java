package pages;

import org.openqa.selenium.By;

import Base.browser;

public class data_login extends browser{
	
	public By my_accountdrop = By.xpath("//select[@class='my_account']");
	public By mail = By.xpath("//input[@id='email']");
	public By password = By.xpath("//input[@id='pass']");
	public By signin_btn = By.xpath("//button[@class='action login primary']");
	
	public void testlogin(String username,String pass) {
		dropDownSelectText(my_accountdrop, "Log In");
		enterText(mail, username);
		enterText(password, pass);
		clickElement(signin_btn);
	}

}
