package com.mavenprodemo.Mavenprojectdemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wordpresssetuplogin {

	static WebDriver driver;
	
	public void setuplogin() {
		
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	 
	
	public void userlogin(){
		
		
		
	WebElement username=	driver.findElement(By.id("user_login"));
	username.sendKeys("admin");
		
	WebElement password=	driver.findElement(By.id("user_pass"));
	password.sendKeys("demo123");
		
		WebElement signinbtn=driver.findElement(By.id("wp-submit"));
		signinbtn.click();
		
       }


	
 public static void main(String[] args)  {
		
				Wordpresssetuplogin refw1  = new Wordpresssetuplogin();
				refw1.setuplogin();
				
				refw1.userlogin();
			
				Afterloginnewbtnadd ref2= new Afterloginnewbtnadd(driver);
				
				ref2.newaddpostbtnmethod();
				
				
				Addnewuser user1= new Addnewuser(driver);
				user1.Addusermethod();
				
          
			
	}

}
