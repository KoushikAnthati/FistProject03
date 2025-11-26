package PageObjrcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='input-firstname']")
      WebElement txtFistname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	   WebElement txtLastname;
	
	@FindBy(xpath=" //input[@id='input-email'] ") 
	   WebElement txtEmail;
	
	@FindBy(xpath=" //input[@id='input-telephone'] ") 
	   WebElement txtphonenumber;
	

	@FindBy(xpath="//input[@id='input-password']") 
	   WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	   WebElement txtConfirmpassword;
	
	
	@FindBy(xpath="//label[normalize-space()='Yes']") 
	  WebElement Rediobtn;
	  
	  
	@FindBy(xpath="//input[@name='agree']") 
	   WebElement Policybtn;
	
	
	@FindBy(xpath="//input[@value='Continue']") 
	   WebElement Continuebtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	   
	public void setFistname(String fname) {
	txtFistname.sendKeys(fname);
	}
	
	public void setLastname (String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	
	public void setPhonenum(String phn) {
		txtphonenumber.sendKeys(phn);
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void setConfirmPassword(String pass) {
		txtConfirmpassword.sendKeys(pass);
	}
	
	public void setclickRediobtn() {
		Rediobtn.click();
	}
	
	
	public void setclickPolicy() {
		Policybtn.click();
	}
	
	
	public void setclickContinuebtn() {
		Continuebtn.click();
		
	}
	  
	
	public String getConfirmation() {
  try {
		
		return	msgConfirmation.getText();
		
	}
  catch(Exception e ) {
	  
	  return (e.getMessage());
  }


	
	
	
	
	}



	
	
}
