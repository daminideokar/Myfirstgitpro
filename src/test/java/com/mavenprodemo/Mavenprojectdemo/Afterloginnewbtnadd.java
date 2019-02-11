package com.mavenprodemo.Mavenprojectdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Afterloginnewbtnadd {

	
	WebDriver driver;
	

	public Afterloginnewbtnadd(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		
		driver=driver2;
	}


	public void newaddpostbtnmethod(){
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement newbtn= driver.findElement(By.xpath("//span[contains(text(),'New')]"));
		newbtn.click();
			
        WebElement titletextbox=  driver.findElement(By.id("title"));
        titletextbox.sendKeys("WELCOME TO MY DAMINI WORLD ");
		
		
		
		WebElement addmediabtn=driver.findElement(By.cssSelector("button[data-editor='content']"));
		addmediabtn.click();
		
		//WebElement selectfile=driver.findElement(By.xpath("//button[contains(text(),'Select Files')]"));
		//selectfile.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Media Library')]")).click();
		
		//driver.findElement(By.xpath("//span[@class='screen-reader-text'][contains(text(),'Close media panel')]")).click();
		
		
		driver.findElement(By.xpath("//span[(contains(text(),'Close media panel'))]")).click();;
	}



	
	
	
	
}
