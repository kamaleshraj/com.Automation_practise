package com.Automation_practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_Test {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login_btn = driver.findElement(By.xpath("//a[@class='login']"));
		login_btn.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kamalesh1@gmail.com");
		
		WebElement paswd = driver.findElement(By.xpath("//input[@id='passwd']"));
		paswd.sendKeys("123456");
		
		WebElement submit_btn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span/i"));
		submit_btn.click();
		
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']")));
		
		WebElement dress = driver.findElement(By.xpath(("(//a[@title='Dresses'])[2]")));
		dress.click();
		
		WebElement casdress = driver.findElement(By.xpath("(//div[@class='subcategory-image'])[1]"));
		casdress.click();
		
		WebElement qview = driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]"));
		qview.click();
		driver.switchTo().frame(0);
		
		WebElement quantadd = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		quantadd.click();
		
		WebElement drpdwn = driver.findElement(By.id("group_1"));
		Select sc2 = new Select(drpdwn);
		sc2.selectByValue("2");
		
		WebElement addcart = driver.findElement(By.id("add_to_cart"));
		addcart.click();
		
		driver.switchTo().defaultContent();
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		
		WebElement chekout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		chekout2.click();
		
		
		WebElement checkout3 = driver.findElement(By.name("processAddress"));
		checkout3.click();
		
		WebElement chekbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chekbox.click();
		
		WebElement proceed = driver.findElement(By.name("processCarrier"));
		proceed.click();
		
		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		cheque.click();
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		
		WebElement order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		order.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Screenshot\\status.png");
		FileUtils.copyFile(source, destination);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
