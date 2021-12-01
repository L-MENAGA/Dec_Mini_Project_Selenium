package com.mini_project_selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.apache.commons.io.Fileutils;
//import org.openqa.selenium.Takescreenshot;
public class Minipro {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
   	    driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	    Thread.sleep(2000);
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("geetha7096@gmail.cim");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("Automationpractice@22");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		Actions M =new Actions(driver);
		WebElement t_Shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		M.moveToElement(t_Shirt).build().perform();
		M.click(t_Shirt).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
		Thread.sleep(30000);
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[@name='Submit']")).click();
	    WebDriverWait wait= new WebDriverWait(driver,150);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
	     WebElement proceedToCart = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	     M.moveToElement(proceedToCart).build().perform();
	     M.click(proceedToCart).build().perform();
	     
	  //   driver.findElement(By.id("order")).click();
	     
      WebElement cart= driver.findElement(By.xpath(("//*[@id=\"center_column\"]/p[2]/a[1]/span")));
      M.moveToElement(cart).build().perform();
	     M.click(cart).build().perform();
      
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.id("cgv")).click();
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	   Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@class='cheque']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollby(0, -3000);");
	    Thread.sleep(8000);
	    
	    
	    
	  TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic4.png");
	   org.openqa.selenium.io.FileHandler.copy(source, destination);
}

}
