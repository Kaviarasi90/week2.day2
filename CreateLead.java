package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM' )]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@class='inputBox'][1]")).sendKeys("JK Automation");
		driver.findElement(By.xpath("//input[@class='inputBox']/following::input[2]")).sendKeys("Kavi");
		driver.findElement(By.xpath("//input[@class='inputBox']/following::input[3]")).sendKeys("J");
		Select source=new Select(driver.findElement(By.xpath("//select[@class='inputBox']"))); 
		source.selectByVisibleText("Employee");
		Select campaign=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"))); 
		campaign.selectByVisibleText("eCommerce Site Internal Campaign");
		Select owner=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"))); 
		owner.selectByValue("OWN_CCORP");
		Select country=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"))); 
		country.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());

}}
