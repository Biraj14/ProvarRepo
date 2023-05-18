package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "AmazonHomePage", summary = "", relativeUrl = "", connection = "UIConn")
public class AmazonHomePage {

	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String Click(String value) {
		WebElement ele = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_" + value + "']"));
		return ele.getText();
	}

	@LinkType()
	@FindBy(xpath = "")
	public WebElement SignInBtn;

	@TextType()
	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement EmailField;

	@LinkType()
	@FindBy(xpath = "//a[@href=\"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\" ]")
	public WebElement helloSignInAccountAndLists;

	@ButtonType()
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continue_login;

	@LinkType()
	@FindBy(xpath = "//i[@aria-label='Amazon']")
	public WebElement HomePage;

	@TextType()
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchAmazon;

	@ButtonType()
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement Serachgo;

	@LinkType()
	@FindBy(xpath = "//div//div/div/h2/a[@href=\"/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&adId=A0382902NVV05U37B4WQ&qualifier=1684307931&id=5083262849141101&widgetName=sp_atf&url=%2FParker-1953170-Jotter-Ballpoint-Stainless%2Fdp%2FB01DJBH2S4%2Fref%3Dsr_1_1_sspa%3Fcrid%3D18ADITNOA9POT%26keywords%3Dparker%2Bpen%26qid%3D1684307931%26sprefix%3Dpakerpen%252Caps%252C532%26sr%3D8-1-spons%26psc%3D1\"]")
	public WebElement clikitem;

	@ButtonType()
	@FindBy(xpath = "//span[@class='a-button a-button-toggle text-swatch-button-with-slots a-button-selected']/span/input[@class='a-button-input']")
	public WebElement MechanicalPencil;


}
