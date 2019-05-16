package Wtogether;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baseclass.Basepage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lurl extends Basepage
{
 
  @BeforeClass
  public void beforeClass() throws Exception 
  {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\SEL code\\selenium\\Admin\\Drivers\\chromedriver.exe");
	   
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://ace.shr-eng.com/#/login");
	     //Thread.sleep(3000);
	     //driver.navigate().to("https://ace.shr-eng.com/admin/login");
	     
	       }
  

  
  }



