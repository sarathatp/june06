package selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutosuggestiveDropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id=autosuggest]")).sendKeys("ind");
		
		Thread.sleep(3000);
		
		List<WebElement>dd_options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:dd_options)
		{
			String o=option.getText();
			System.out.println(o);
			if(option.getText().equals("India"))
			{
				System.out.println("india found");
				option.click();
				break;
			}
		}
		
	}

}
