package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjrcts.AccountRegistrationPage;
import PageObjrcts.HomePage;
import testBase.BaseClass;

public class TC_001AccountRegistration extends BaseClass {

	
	
       @Test(groups={"Master"})
		public void test_account_Registration() throws InterruptedException
		{		
			logger.info("Strating TC_001_AccountRegistrationtTest");
			try {
				HomePage hp = new HomePage(driver);
				hp.clickMyaccount();
				logger.info("Clicked on My Account ");
				
				hp.clickRegister();
				logger.info("Clicked on Register ");

				AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
				
				regpage.setFistname(Generativestring().toUpperCase());
				logger.info("Provided First Name ");

				regpage.setLastname(Generativestring().toUpperCase());
				logger.info("Provided Last Name ");

				regpage.setEmail(generativeAlphaNumaric() + "@gmail.com");// randomly generated the email
				//regpage.setEmail("pavannoltraining@gmail.com");// duplicate email should fail test case
				logger.info("Provided Email ");

				regpage.setPhonenum("phn");
				logger.info("Provided Telephone ");

				regpage.setPassword("test@123");
				logger.info("Provided Password ");

				regpage.setConfirmPassword("test@123");
				logger.info("Provided Confrmed Password ");

				regpage.setclickPolicy();
				logger.info("Set Privacy Policy ");

				regpage.setclickContinuebtn();
				logger.info("Clicked on Continue ");

				Thread.sleep(2000);

				String confmsg = regpage.getConfirmation();
				Assert.assertEquals(confmsg, "Your Account Has Been Created!");
			}
			catch(Exception e)
			{
				Assert.fail();
			}

			logger.info("Finished TC_001_AccountRegistrationtTest");
		
		
		
		
		}

	
	
	
	}
	

