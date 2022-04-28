package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Kaviarasi");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Jayabalan");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("JK");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("VJ");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("This is automated");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[15]")).sendKeys("kavijk90@gmail.com");
		Select css= new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		css.selectByValue("TX");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[2]")).sendKeys("its important");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());

}}
