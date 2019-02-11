package com.mavenprodemo.Mavenprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addnewuser {

	
	WebDriver driver;
	
	public Addnewuser(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		driver=driver2;
		
	}

	public void Addusermethod(){
		
		driver.findElement(By.xpath("//a[contains(.,'User')[3]")).click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
