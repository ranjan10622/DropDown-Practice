package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeStaticDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
		  //dropdown with select tag --static
		  
		  WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  
		  Select dropdown = new Select(staticDropdown);
		   
		     dropdown.selectByIndex(2);
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    
		    dropdown.selectByVisibleText("USD");
		    System.out.println(dropdown.getFirstSelectedOption().getText());
		    
		    dropdown.selectByValue("INR");
		    System.out.println(dropdown.getFirstSelectedOption().getText());

		    
	

	}

}
