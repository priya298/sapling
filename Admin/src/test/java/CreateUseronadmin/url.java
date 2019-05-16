package CreateUseronadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Baseclass.Basepage;

public class url extends Basepage
{
	 @BeforeClass
	  public void beforeClass() throws Exception 
	  {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\SEL code\\selenium\\Admin\\Drivers\\chromedriver.exe");
		   
		     driver =new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.get("https://ace.shr-eng.com/admin/login");
		     
		       }

}
