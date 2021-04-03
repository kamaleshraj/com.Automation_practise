package com.Automation_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://automationpractice.com/index.php");
	
	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	login.click();
	
	WebElement email = driver.findElement(By.id("email_create"));
	email.sendKeys("kamalesh1@gmail.com");
	
	WebElement crt_btn = driver.findElement(By.id("SubmitCreate"));
	crt_btn.click();
	Thread.sleep(5000);
	
	WebElement radio_btn = driver.findElement(By.id("id_gender1"));
	radio_btn.click();
	
	
	WebElement fst_name = driver.findElement(By.id("customer_firstname"));
	fst_name.sendKeys("Kamalesh");
	Thread.sleep(1000);
	
	WebElement last_name = driver.findElement(By.id("customer_lastname"));
	last_name.sendKeys("Raj");
	
	WebElement paswd = driver.findElement(By.id("passwd"));
	paswd.sendKeys("123456");
	
	WebElement day_drpdwn = driver.findElement(By.id("days"));
	day_drpdwn.click();
	
	Select sc = new Select(day_drpdwn);
	sc.selectByValue("3");
	
	WebElement month = driver.findElement(By.id("months"));
	Select sc1 = new Select(month);
	sc1.selectByValue("5");
	
	
	WebElement yrs = driver.findElement(By.id("years"));
	Select sc2 = new Select(yrs);
	sc2.selectByValue("2019");
	
	WebElement fname = driver.findElement(By.id("firstname"));
	fname.sendKeys("Kamalesh");
	
	WebElement lname = driver.findElement(By.id("lastname"));
	lname.sendKeys("RAj");
	
	WebElement cmp = driver.findElement(By.id("company"));
	cmp.sendKeys("IBM");
	
	WebElement addr = driver.findElement(By.id("address1"));
	addr.sendKeys("DLF");
	
	WebElement cit = driver.findElement(By.id("city"));
	cit.sendKeys("Chennai");
	
	WebElement state = driver.findElement(By.id("id_state"));
	Select sc3 = new Select(state);
	sc3.selectByValue("3");
	
	WebElement cnty = driver.findElement(By.id("id_country"));
	Select sc4 = new Select(cnty);
	sc4.selectByVisibleText("United States");
	
	
	WebElement pcode = driver.findElement(By.id("postcode"));
	pcode.sendKeys("60012");
	
	WebElement mobile = driver.findElement(By.id("phone_mobile"));
	mobile.sendKeys("1234567890");
	
	WebElement reg = driver.findElement(By.id("submitAccount"));
	reg.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
