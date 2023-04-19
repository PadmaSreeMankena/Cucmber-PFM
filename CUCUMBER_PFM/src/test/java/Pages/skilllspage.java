package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skilllspage {
	
	private WebDriver driver;


	public void passdriver(WebDriver driver1)
	 {
		 this.driver=driver1;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//span[text()='Admin']")
	 WebElement Admin;
	 
	 @FindBy(xpath="//span[text()='Qualifications ']")
	 WebElement Qualifications;
	 
	 @FindBy(xpath="//a[text()='Skills']")
	 WebElement Skills;
	 
	 @FindBy(xpath="//button[text()=' Add ']")
	 WebElement Addbutton;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	 WebElement SkillName;
	 
	 @FindBy(xpath="//textarea[ @placeholder='Type description here']")
	 WebElement SkillDesc;
	 
	 @FindBy(xpath="//button[text()=' Save ']")
	 WebElement Save;
	 
	 
	 public void navigateskills()
	 {
		 Admin.click();
		Qualifications.click();
		Skills.click();
		 
		
	 }
	 
	 public void addskills(String Skillname,String Skilldesc) throws InterruptedException
	 {
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 Addbutton.click();
		 SkillName.sendKeys(Skillname);
		 SkillDesc.sendKeys(Skilldesc);
			
			Thread.sleep(5000);
			Save.click();
	 }
	 
	/* public void addskills1(DataTable datatable) throws InterruptedException
	 {
		 
		 List<Map<String, String>> SkillsData=datatable.asMaps(String.class,String.class);
			
			for(int i=0;i<SkillsData.size();i++) {
			s
			String SkillName=SkillsData.get(i).get("SkillName");
			String SkillDescr=SkillsData.get(i).get("Skilldesc");
			
			driver.findElement(Addbutton).click();
			driver.findElement(skillname).sendKeys(SkillName);
			driver.findElement(skilldesc).sendKeys(SkillDescr);
				
			Thread.sleep(5000);
			driver.findElement(savebutton).click();
	 }
	 }*/

}
