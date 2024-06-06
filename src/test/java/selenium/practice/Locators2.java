package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Locators2 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		String path=System.getProperty("user.dir");
//		System.out.println(path);
//		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
//	
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		
//		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		String name="Sarath";
		String password=getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("inputUsername")).sendKeys("sarath");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		
		
				driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		//SoftAssert softAssert=new SoftAssert();
//		softAssert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You 1are successfully logged in.");
//		System.out.println("not matched - sk");
//		softAssert.assertAll();
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		System.out.println("matched - sk");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		

		Thread.sleep(30000);
		driver.quit();
		

	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();	
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		
		return password;
		
		//Please use temporary password '
		//rahulshettyacademy' to Login.


		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
