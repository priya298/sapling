package Usersupdate;

import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;






public class LoginTest extends launchingUrl
{
	@Test
	public void init() throws InterruptedException 
	{
		Adminlogin login=PageFactory.initElements(driver, Adminlogin.class);
		
		//invoke this credentials from adminlogin page
	    login.enteremail("admin@example.com", "password");
		login.invalidemail("pinky@test.com");
	    login.vaildemail("priyag@test.com", "admin123@");
		}	
		
	
		
		
		
		
	

}


