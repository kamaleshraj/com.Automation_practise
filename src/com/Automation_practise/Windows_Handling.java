package com.Automation_practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Actions ac = new Actions(driver);

		Robot r = new Robot();

		// Todays deal

		WebElement todaysD = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(todaysD).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// mobile

		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(mobile).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// best sellers

		WebElement bseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		ac.contextClick(bseller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle();

		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}

		String actualTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String id : allids) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle))
				break;
			

		}

	}
}
