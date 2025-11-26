package PageObjrcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_AccountPage extends BasePage {

	public My_AccountPage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//h2[normalize-space()='My Account']")
     WebElement myaccountpage;


@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
     WebElement LogoutLink;







      public boolean isMyAccountexists()
      {   
      try{

	return (myaccountpage.isDisplayed() );
	

      }
      catch(Exception e)
      {
    	  return (false);
      }
      }	
  
  public void clicklogout()
  {
	  LogoutLink.click();
  }
      
      
      
	

}