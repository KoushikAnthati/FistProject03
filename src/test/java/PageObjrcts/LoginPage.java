package PageObjrcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {

	

public LoginPage(WebDriver driver) {
		super(driver);
		
	}

@FindBy(xpath="//input[@id='input-email']")
  WebElement txtEmailLink;
	
@FindBy(xpath="//input[@id='input-password']")
   WebElement txtPassward;

@FindBy(xpath="//input[@value='Login']")
	WebElement Countinubtn;
	
	


public void setEmail (String email)
{
	txtEmailLink.sendKeys(email);
}

public void setPass(String pwd)
{
	txtPassward.sendKeys(pwd);
}

public void clickLogin()
{
	Countinubtn.click();
}








	}
	
	

