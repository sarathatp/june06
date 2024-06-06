package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("inputUsername")).sendKeys("sarath");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("sk");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Abcd@2023");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//using css selector
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("cs");
		//driver.findElement(By.cssSelector("input['placeholder'='Username']"));
		
		//forgot password
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sarath");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sarath.atp2@outgmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sarath.atp2@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("6476476476");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//login		//temporary pwd - rahulshettyacademy
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sarath");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		Thread.sleep(30000);
		driver.quit();
		

	}

}
