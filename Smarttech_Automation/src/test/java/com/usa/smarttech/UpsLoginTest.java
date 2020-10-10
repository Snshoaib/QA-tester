
package com.usa.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsLoginTest {

	static WebDriver drive;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//a[@class='ups-analytics'])[6]")).click();
	      driver.findElement(By.xpath("//span[@class='icon ups-icon-x']")).click();
	      driver.findElement(By.xpath("//a[@class='ups-link']")).click();
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.id("email")).sendKeys("Smshoab@gmail.com");
	      driver.findElement(By.id("pwd")).sendKeys("SNshoaib88");
	      driver.findElement(By.id("submitBtn")).click();
	      System.out.println(driver.getTitle());
		
		
	}
	
}
