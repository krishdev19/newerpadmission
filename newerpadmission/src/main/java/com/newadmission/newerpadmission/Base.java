package com.newadmission.newerpadmission;

//import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.newerpadmission.page.WebDriver;

public class Base {
	public static WebDriver driver;
	
	@Test
	public void Login() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\SEL\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();	 
		  driver.get("http://qaerp.franciscanecare.net/Secure/");
		  driver.findElement(By.id("txtUserName")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("Admin#franciscan");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  /*String Parentwindow=driver.getWindowHandle();
		  System.out.println(Parentwindow);*/
		  driver.findElement(By.xpath("//*[@id=\"form1\"]/div[4]/div/div/div/div/div[4]/a/img")).click();
		  
		  			/*Set<String> menulist= driver.getWindowHandles();
		  System.out.println(menulist);
		  Thread.sleep(200);
				  
				  for(String A : menulist)
				  {
					  if(!Parentwindow.equalsIgnoreCase(A))
					  {
						  driver.switchTo().window(A);
					  }
				  }*/
				  
			
		  WebElement mousehover = driver.findElement(By.xpath("//*[@id=\"form2\"]/div[4]/div/ul/li[3]/a/img"));
				  

		 Actions action = new Actions(driver);
		  action.moveToElement(mousehover).perform();   
		 action.moveToElement(mousehover).moveToElement(driver.findElement(By.xpath("//*[@id=\"form2\"]/div[4]/div/ul/li[3]/ul/li[1]/a"))).click().build().perform();
	
	
	}
	
	
	
	
	
	

}
