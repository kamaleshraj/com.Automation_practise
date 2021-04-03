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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Proj {

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
		
		WebElement summer = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		summer.click();
		
		WebElement quickV = driver.findElement(By.xpath("//a[@class='product_img_link'][1]"));
		quickV.click();
		driver.switchTo().frame(0);
		
		WebElement addquant = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		addquant.click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select sc1 = new Select(size);
		sc1.selectByValue("3");
		
		WebElement color = driver.findElement(By.xpath("//a[@title='Black']"));
		color.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		addtocart.click();
		
		driver.switchTo().defaultContent();
		
		WebElement addcart1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		addcart1.click();
		
		WebElement pcheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		pcheckout.click();
		
		WebElement addrs = driver.findElement(By.name("processAddress"));
		addrs.click();
		
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		
		WebElement process = driver.findElement(By.name("processCarrier"));
		process.click();
		
		WebElement pay1 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay1.click();
		
		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit1.click();
		
		WebElement backtoorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		backtoorder.click();
		
		WebElement home	 = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[2]"));
		home.click();
		
		WebDriverWait wait1 =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']")));
		
		WebElement dressS = driver.findElement(By.xpath(("(//a[@title='Dresses'])[2]")));
		dressS.click();
		
		WebElement summerdress = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		summerdress.click();
		
		WebElement quickView = driver.findElement(By.xpath("(//a[@class='product_img_link'])[3]"));
		quickView.click();
		driver.switchTo().frame(0);
		
		WebElement addquanty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		addquanty.click();
		
		WebElement sizee = driver.findElement(By.id("group_1"));
		Select sc2 = new Select(sizee);
		sc2.selectByValue("2");
		
		WebElement colour = driver.findElement(By.xpath("//a[@title='Green']"));
		colour.click();
		
		WebElement addcart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		addcart.click();
		driver.switchTo().defaultContent();
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		
		WebElement pcheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		pcheckout2.click();
		
		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btn.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement prtocheck = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		prtocheck.click();
		
		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		cheque.click();
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		
		WebElement back2 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back2.click();
		
		WebElement mouse = driver.findElement(By.id("block-history"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouse);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Screenshot\\test.png");
		FileUtils.copyFile(source, destination);
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		logout.click();
		
	}	
	
}
	
	
	
	

