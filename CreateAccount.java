package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM' )]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//input[@class='inputBox']/following::input[4]")).sendKeys("3000000");
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		industry.selectByVisibleText("Computer Software");
		Select ownership = new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		ownership.selectByVisibleText("S-Corporation");
		Select marketing = new Select(driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
		marketing.selectByValue("9000");
		Select state = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
}
