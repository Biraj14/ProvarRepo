package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class MyPageObject {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Close ProvarEY']")
	public WebElement closeProvarEY;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Parent Account']/following-sibling::div//input")
	public WebElement ParentId;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Contact Name']/following-sibling::div[1]//input")
	public WebElement ContactId;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/span/span[normalize-space(.)='Show All Results for \"anub\"']")
	public WebElement ContactId1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('records-modal-lwc-detail-panel-wrapper').shadowRoot.querySelector('records-lwc-detail-panel').shadowRoot.querySelector('records-base-record-form').shadowRoot.querySelector('records-lwc-record-layout').shadowRoot.querySelector('forcegenerated-detailpanel_case___012200000006wqmaay___full___create___recordlayout2').shadowRoot.querySelectorAll('records-record-layout-lookup')[1].shadowRoot.querySelector('lightning-lookup').shadowRoot.querySelector('lightning-lookup-desktop').shadowRoot.querySelector('lightning-grouped-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('lightning-base-combobox-item').shadowRoot.querySelectorAll('span')[3]")
	public WebElement ContactId11;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//tr[4]/td[1]/a[normalize-space(.)='Anubhav Sharma']")
	public WebElement Name;
	
	
	
		WebDriver driver;
	
	public MyPageObject(WebDriver driver)
	{
	this.driver=driver;

	}
	
	
	public void foo(){
	
	driver.findElement(By.xpath("//label[normalize-space(.)='Contact Name']/following-sibling::div//input")).sendKeys("anub");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
			
}
