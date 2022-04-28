package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NTCreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM' )]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		Select currency= new Select(driver.findElement(By.xpath("//select[@id='currencyUomId']")));
		currency.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//input[@class='inputBox']/following::input[4]")).sendKeys("3000000");
		Select marketing = new Select(driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
		marketing.selectByValue("9000");
		Select state = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String findElement = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(findElement);
	}

}
