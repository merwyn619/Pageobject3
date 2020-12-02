package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RMLoginpage;
import objectrepository.RMMarketnewspage;
import objectrepository.RMTrendspage;

public class Loginapplication {

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RMLoginpage rl=new RMLoginpage(driver);
		rl.signin().click();
		rl.email().sendKeys("merwyn@abc.com");
		rl.pwd().sendKeys("123456");
		//rl.submit().click();
		rl.rm().click();
		rl.trends().click();
		RMTrendspage rt=new RMTrendspage(driver);
		rt.search().sendKeys("Tata");
		rt.submit().click();
		rl.rm().click();
		rl.marketNews().click();
		RMMarketnewspage rm=new RMMarketnewspage(driver);
		//rm.search().sendKeys("Axis");
		rm.showMore().click();
		rl.rm().click();
		System.out.println(driver.getTitle());
	}
}
