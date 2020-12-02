package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMTrendspage {

	WebDriver driver;
	public RMTrendspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.cssSelector("#srchword");
	By submit=By.cssSelector("[class*='btn_srch']");
		
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
}
