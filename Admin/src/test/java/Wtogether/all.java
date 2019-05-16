package Wtogether;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class all 
{
	WebDriver driver;


	  
	 
		
	  @FindBy(xpath=" //input[@id='input_0']") WebElement entergmail;
	  @FindBy(xpath="//input[@id='input_1']") WebElement enterpassword;
	  @FindBy(xpath="//button[@class='sapling-primary submit-button md-button ng-scope md-default-theme md-ink-ripple']") WebElement click;

	  
	  public void LoginPage(WebDriver driver) {           
	         this.driver = driver; 
	         PageFactory.initElements(driver, this);
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
