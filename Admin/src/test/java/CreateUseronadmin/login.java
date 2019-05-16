package CreateUseronadmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class login 
{
	@FindBy(id="admin_user_email") WebElement adminemail;
    @FindBy(id="admin_user_password") WebElement adminpassword;
    @FindBy(xpath=" //input[@value='Login']") WebElement adminlogin;
   
    //click on users tab
    @FindBy(xpath="//a[@href='/admin/users']") WebElement clickuser;
    
    //need to enter the invalidemail id in searchbox
    @FindBy(id="q_email") WebElement enterinvalidemail;
    @FindBy(xpath="//input[@value='Filter']") WebElement filter;
    
    @FindBy(xpath="//a[@class='clear_filters_btn']") WebElement clearfilter;
   @FindBy(xpath="//a[contains(text(),'New User')]") WebElement newuser;
   @FindBy(id="user_title") WebElement entertitle;
   @FindBy(id="user_first_name") WebElement enterfirstname;
   @FindBy(id="user_last_name") WebElement enterlastname;
   @FindBy(id="user_password") WebElement enterpassword;
   @FindBy(id="user_password_confirmation") WebElement entercpswd;
   @FindBy(id="user_email") WebElement entergmail;
   @FindBy(id="user_personal_email") WebElement enterpersonalemail;
   @FindBy(xpath="//select[@id='user_onboard_email']") WebElement clickonboard;
   //@FindBy(xpath="//option[contains(text(),'Both')]") WebElement select;
   @FindBy(xpath="//select[@id='user_company_id']") WebElement clickcompany;
   //@FindBy(xpath="//option[contains(text(),'Ace')]") WebElement selcomp;
   @FindBy(xpath="//select[@id='user_role']") WebElement role;
   @FindBy(id="user_start_date") WebElement startdate;
   @FindBy(xpath="//select[@id='user_current_stage']") WebElement stage;
   @FindBy(xpath="//input[@name='commit']") WebElement clickcreate;
   
   
   public void selectbytext(WebElement elementname ,String text)
	{
		Select sel=new Select(elementname);
		sel.selectByVisibleText(text);
	}

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
   
 public void newuser(String title, String firstname, String lastname,String pswd, String cpswd,String email, String pemail, String Both, String Ace, String Employee, String date, String cstage)
 {
	 newuser.click();
	 entertitle.sendKeys(title);
	 enterfirstname.sendKeys(firstname);
	 enterlastname.sendKeys(lastname);
	 enterpassword.sendKeys(pswd);
	 entercpswd.sendKeys(cpswd);
	 entergmail.sendKeys(email);
	 enterpersonalemail.sendKeys(pemail);
	 //clickonboard.click();
	 selectbytext(clickonboard, Both);
	 //clickcompany.click();
	 selectbytext(clickcompany, Ace);
	 //role.click();
	 selectbytext(role, Employee);
	 startdate.sendKeys(date);
	 selectbytext(stage, cstage);
	 clickcreate.click();
	 
	 
	 
	 }


   
   
   

}
