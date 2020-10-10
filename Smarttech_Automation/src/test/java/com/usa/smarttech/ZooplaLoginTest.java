package com.usa.smarttech;

   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;

   public class ZooplaLoginTest {
   static WebDriver driver;
   //Declear Webdriver (it is a global/Class variable ) 

    public static void main(String[] args) {
		
	System. setProperty("webdriver.chrome.driver", "C:\\Users\\smsho\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.ups.com/us/en/global.page");	
    } 
   


	
}
