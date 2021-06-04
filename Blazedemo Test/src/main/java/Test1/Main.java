
package Test1;

import org.openqa.selenium.*; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class Main {
	
	public static void main(String [] args ) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saigh\\eclipse-workspace\\Blazedemo Test\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.navigate().to("https://blazedemo.com/");
	
	Select drpCountry = new Select(driver.findElement(By.name("fromPort")));
	drpCountry.selectByValue("Boston");
	
	Select desCountry = new Select(driver.findElement(By.name("toPort")));
	desCountry.selectByValue("London");
	
	WebElement Findflights = driver.findElement(By.xpath("//input[@type='submit']"));
	Findflights.click();
	
	WebElement Chooseflight = driver.findElement(By.xpath("//input[@type='submit']"));
	Chooseflight.click();
	
	WebElement nametxt = driver.findElement(By.id("inputName"));
	nametxt.sendKeys("John Smith");
	
	WebElement addresstxt = driver.findElement(By.id("address"));
	addresstxt.sendKeys("ABC street");
	
	WebElement citytxt = driver.findElement(By.id("city"));
	citytxt.sendKeys("London");
	
	WebElement statetxt = driver.findElement(By.id("state"));
	statetxt.sendKeys("UK");
	
	WebElement ziptxt = driver.findElement(By.id("zipCode"));
	ziptxt.sendKeys("12345");
	
	WebElement cctxt = driver.findElement(By.id("creditCardNumber"));
	cctxt.sendKeys("123456789");
	
	WebElement monthtxt = driver.findElement(By.id("creditCardMonth"));
	monthtxt.sendKeys("10");
	
	WebElement yeartxt = driver.findElement(By.id("creditCardYear"));
	yeartxt.sendKeys("2024");
	
	WebElement nameoncardtxt = driver.findElement(By.id("nameOnCard"));
	nameoncardtxt.sendKeys("John Smith");
	
	Select cardType = new Select(driver.findElement(By.id("cardType")));
	cardType.selectByValue("amex");
	
	WebElement Purchaseflights = driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
	Purchaseflights.click();
	
	WebElement Rememberme = driver.findElement(By.id("rememberMe"));
	Rememberme.click();
	
	WebElement  finalConfirmation = driver.findElement(By.xpath("//h1]"));
	String confirmationtext = finalConfirmation.getText();
	String Checkvalue = "Thank you for your purchase today!";
	if(confirmationtext.equals(Checkvalue))
	{
		 System.out.println("Test Passed!");

	}
	
	else 
	{
	
	System.out.println("Some Error, Test Failed");

	}
	
	driver.close();
	
	}	
}