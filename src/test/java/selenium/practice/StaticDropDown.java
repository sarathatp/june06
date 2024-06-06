package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown 
{

	public static void main(String[] args) 
	{
		
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement currency=driver.findElement(By.cssSelector("[id='ctl00_mainContent_DropDownListCurrency']"));
		Select select=new Select(currency);
		select.selectByIndex(3);
		String currencySelected=select.getFirstSelectedOption().getText();

		System.out.println(currencySelected);
		
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		
		
	}

}
