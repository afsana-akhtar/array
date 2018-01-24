package com.bit;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
 
	 public WebDriver driver;  //public korte hobe
	
	
	
	
  @BeforeMethod
  public void beforeMethod() {
  System.setProperty("webdriver.gecko.driver","C:\\Users\\MouryRaz\\Desktop\\jar file\\geckodriver-v0.19.0-win64(1)\\geckodriver.exe");
  driver=new FirefoxDriver();
  driver.get("http://www.target.com/");
  driver.manage().window().maximize();
  
  }

  @AfterMethod
  public void afterMethod() {
   driver.quit();
  
  }

}
