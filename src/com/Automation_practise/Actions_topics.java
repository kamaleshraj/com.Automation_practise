package com.Automation_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.baseclass.Base_class;

public class Actions_topics extends Base_class {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Driver\\chromedriver.exe");

		driver = getUrl("http://automationpractice.com/index.php");

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

		Actions ac = new Actions(driver);

		ac.moveToElement(dresses).build().perform();

		WebElement eve_dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));

		ac.moveToElement(eve_dress).build().perform();

		ac.click(eve_dress).build().perform();

	}

}
