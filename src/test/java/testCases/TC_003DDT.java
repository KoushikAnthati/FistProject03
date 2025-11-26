package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjrcts.HomePage;
import PageObjrcts.LoginPage;
import PageObjrcts.My_AccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003DDT extends BaseClass {

		
		@Test (dataProvider="LoginData", dataProviderClass=DataProviders.class)
		public void dataDriventest(String email, String pwd, String exp)
		{
			logger.info("************** TC_003_Test Started  ************************");
		try 
		{	
			HomePage hp= new HomePage(driver);
		
		
		hp.clickMyaccount();
		
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(email);
		
		lp.setPass(pwd);
		
		lp.clickLogin();
		
	My_AccountPage  myAcc=new My_AccountPage(driver);
	
	boolean	Targetpage =myAcc.isMyAccountexists();
	
	    if (exp.equalsIgnoreCase("valid"))
	    {
	    	if(Targetpage==true)
	    	{
	    	myAcc.clicklogout();
	    	
	    	Assert.assertTrue(true);
	   }
	    else
	    {
	    	
	    	Assert.assertTrue(false);	    	
	    }
	    	
	    }
	    
	    
	    if (exp.equalsIgnoreCase("invalid"))
	    {
	    	if (Targetpage==true)
	    	{
	    		myAcc.clicklogout();
	    		Assert.assertTrue(false);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(true);
	          	}
	         }	
	 
		}
	    catch(Exception  e)
	    	{
	    	Assert.fail("Exception accurrred failed "+ e.getMessage());
	    
	    	}

		}
		
		
}
		
	
