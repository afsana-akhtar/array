package com.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Utility  {
 
	WebDriver dr;                   // constructorer driver ta ,base class er 
	
	public Utility(WebDriver driver) {
	this.dr=driver;
	
	}
	   public void catagery() 
	{
		dr.findElement(By.xpath("html/body/div[2]/div[2]/nav[1]/a[2]")).click();
		List<WebElement> element = dr.findElements(By.xpath("html/body/div[2]/div[3]/div[1]/div/div/div/nav/ul[2]/li"));
		String [] expectedValue= {"main menu", "Valentine's Day","clothing","shoes" };	
		//int size=expectedValue.length;
		//String actualText=" ";
		ArrayList<String> actualValue=new ArrayList<String>();
		for(WebElement elements:element) {
			actualValue.add(elements.getText());
	
			

		}
	System.out.println("Actual value comes from website"+actualValue);

		
		
		for(int i=0;i<expectedValue.length;i++) {
			Assert.assertEquals(expectedValue[i],actualValue.get(i) );
			System.out.println(expectedValue[i] + " match  "+ actualValue.get(i));
			
		}			
		
//		int i=0;
//		while(i<expectedValue.length) {
//			System.out.println(expectedValue[i]);
//			i++;
//		}
//		System.out.println("Outside for loop");
//		
//		
//		
//		for(WebElement elements:element) {
//			
//			actualText=elements.getText();
//			System.out.println(elementsText);
//			
//			System.out.println(elements.getText());
//			
//		}
//		
//		Assert.assertEquals(expectedValue, actualText);
//		
	
		
		
	} 

	
		
		
		
		
		
		
		
		
		
	}
	
