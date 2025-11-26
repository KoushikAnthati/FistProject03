package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjrcts.HomePage;
import PageObjrcts.LoginPage;
import PageObjrcts.My_AccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups={"Sanity","Master"})
	public void Verifyin_Logintest()
	{
		try {
		logger.info("**************Logintest Verifyiing_ Starterd ************************");
		
		HomePage hp= new HomePage(driver);
		logger.info("**************Clicling myaccounts ************************");
		
		hp.clickMyaccount();
		
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(p.getProperty("email"));
		
		lp.setPass(p.getProperty("password"));
		
		lp.clickLogin();
		
		My_AccountPage  macc=new My_AccountPage (driver);
		
		boolean targetPage=macc.isMyAccountexists();
		
		Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("************** TC_002_LoginTest is Fineshed ************************");
	
	
		
	}
	
	
	
	
	

}
