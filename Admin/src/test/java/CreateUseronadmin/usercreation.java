package CreateUseronadmin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class usercreation extends url
{
	@Test
	public void init() throws InterruptedException
	{
		login obj=PageFactory.initElements(driver, login.class);
		obj.enteremail("admin@example.com", "password");
		obj.invalidemail("pinky@test.com");
	    obj.newuser("greet", "radha", "choudary", "admin123!", "admin123!", "radha123@ace.com", "radha123@ace.com", "Both", "Ace", "Employee","2019-04-24","pre_start");
		
	}

}
