package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	WebDriver driver;
	/*By Welcome=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	By Logout=By.xpath("//a[text()='Logout']");*/
	
	public void passdriver(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement LogOut;
	
	public void logout()
	{
		welcome.click();
		LogOut.click();
	}

}
