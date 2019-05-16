package Usersupdate;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminlogin 
{
   WebDriver driver;


  
  public void credentials (WebDriver driver)
  {
	   this.driver=driver;
	   
	}
	
	
	

    
    // this is used for admin portal login
	@FindBy(id="admin_user_email") WebElement adminemail;
    @FindBy(id="admin_user_password") WebElement adminpassword;
    @FindBy(xpath=" //input[@value='Login']") WebElement adminlogin;
   
    //click on users tab
    @FindBy(xpath="//a[@href='/admin/users']") WebElement clickuser;
    
    //need to enter the invalidemail id in searchbox
    @FindBy(id="q_email") WebElement enterinvalidemail;
    @FindBy(xpath="//input[@value='Filter']") WebElement filter;
    
    @FindBy(xpath="//a[@class='clear_filters_btn']") WebElement clearfilter;
   
    //need to enter the valid emailid
    @FindBy(id="q_email") WebElement entervalidemail;
    @FindBy(xpath="//input[@value='Filter']") WebElement filterbutton;
    
    //click on edit button and update the password
    @FindBy(xpath="//a[@title='Edit']") WebElement clickedit;
    @FindBy(id="user_password") WebElement updatepassword;
    @FindBy(id="user_password_confirmation") WebElement confirmpassword;
    
    //this will update the password
    @FindBy(xpath="//input[@value='Update User']") WebElement updateuser;
    
    
   
  
           public void enteremail(String email, String pswd) throws InterruptedException
           {
	            adminemail.sendKeys(email);
	            Thread.sleep(1000);
	            adminpassword.sendKeys(pswd);
	            Thread.sleep(1000);
	            adminlogin.click();
	            Thread.sleep(1000);
	            clickuser.click();
            }
	   
           public void invalidemail(String email) throws InterruptedException
	       {
		      enterinvalidemail.sendKeys(email);
		      Thread.sleep(1000);
		      filter.click();
		      Thread.sleep(1000);
		      clearfilter.click();  
	       }
	  
           public void vaildemail(String email, String pswd) throws InterruptedException
	       {
		      
        	  entervalidemail.sendKeys(email);
        	  Thread.sleep(1000);
	          filterbutton.click();
	          Thread.sleep(1000);
	          clickedit.click();
	          Thread.sleep(1000);
	          updatepassword.sendKeys(pswd);
	          Thread.sleep(1000);
	          confirmpassword.sendKeys(pswd);
	          Thread.sleep(1000);
	          updateuser.click();
	       }
}

