package pageobjects;

import java.util.List;
import javax.swing.*;
import java.awt.*;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="Acme_UserName"                                
     , summary=""
     , relativeUrl=""
     , connection="ACME_Bank"
     )             
public class Acme_UserName {



	@TextType()
	@FindBy(xpath = "//input[@id='username']")
	public WebElement EnterYourUsername;
	
	@TextType()		
	@FindBy(xpath = "//input[@id='password']")
	public WebElement EnterYourPassword;
	
	@LinkType()
	@FindBy(xpath ="//a[@id='log-in']")
	public WebElement SignInButton;
	
	WebDriver driver;
	
	public Acme_UserName(WebDriver driver)
	{
	this.driver=driver;

	}
	
	
	

	public void Login(String user, String pass) {
	
	
		EnterYourUsername.sendKeys(user);
		//driver.findElement(By.xpath("//input[@id='username']"));
		
		EnterYourPassword.sendKeys(pass);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		
		SignInButton.click();
		//driver.findElement(By.xpath("//a [@id='log-in']")).click();
		
		
		
}	

	 
	 @PageRow()
public static class banktable {
@TextType()
@FindBy(xpath = ".//td//span[@class='status-pill smaller green']/following-sibling::span")
public WebElement Status;
@TextType()
@FindBy(xpath = ".//td[3]//span")
public WebElement Description;
}
@PageTable(row = banktable.class,firstRowContainsHeaders = false)
@FindBy(xpath = "//table[@class='table table-padded']//tbody/tr[1]")
public List<banktable> banktable;

 public String INputOUTput(String input)
 {
	 String x = input;
	 return x;
	 }
	














	
}
