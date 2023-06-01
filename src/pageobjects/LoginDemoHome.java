package pageobjects;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LoginDemoHome"                                
     , summary=""
     , relativeUrl=""
     , connection="ACME_Bank"
     )             
public class LoginDemoHome {

	@TextType()
	@FindBy(xpath = "//input[@id='username']")
	public WebElement Username;
	
	@TextType()
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@BooleanType()
	@FindBy(xpath = "//input[@class='form-check-input']")
	public WebElement RemeberMe;
	 
	@ButtonType()
	@FindBy(xpath ="//a[@id='log-in']")
	public WebElement SignIn;
			
}
