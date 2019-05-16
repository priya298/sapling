package Logintoapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baseclass.Basepage;

public class App extends Basepage
{
   @BeforeClass
   public void bf()
   {

	   System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\SEL code\\selenium\\Admin\\Drivers\\chromedriver.exe");
	   
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://ace.shr-eng.com/#/login");
   }
   
   @Test
   public void applogin()
   {
	   
   }
}
