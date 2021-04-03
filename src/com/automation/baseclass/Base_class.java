package com.automation.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver WebDriver(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;

	}
	
	public static org.openqa.selenium.WebDriver getBrowser(String value) {
		driver.get(value);
		return driver;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(String value, WebElement element) {
		element.sendKeys(value);

	}

	public static void inputpassword(String value, WebElement element) {
		element.sendKeys(value);
	}

	public static void browserLaunch(String url) {
		driver.get(url);
	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Enabled or not:" + enabled);
	}

	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}

	public static void navigate_forward(String url) {
		driver.navigate().forward();
	}

	public static void navigate_refresh(String url) {
		driver.navigate().refresh();
	}

	public static void navigate_Back(String url) {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static org.openqa.selenium.WebDriver getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void isDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			System.out.println("DIsplay it or not:" + displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			System.out.println("Selected or not:" + selected);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getCurrentUrl(String url) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URl is " + currentUrl);
	}

	public static void dropdown(WebElement element, String value, String type) throws IOException {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byindex")) {

			int value1 = Integer.parseInt(type);
			s.selectByIndex(value1);

		} else if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byvisibleText")) {

		}

	}

	public static void takeScreenshot(String path) throws IOException {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);

			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void frame(String value, String type) {

		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(value));
		} else if (type.equalsIgnoreCase("id") || type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		}

		else if (type.equalsIgnoreCase("xpath")) {
			driver.switchTo().frame(driver.findElement(By.xpath(value)));
		} else if (type.equalsIgnoreCase("partiallinktest")) {
			driver.switchTo().frame(driver.findElement(By.partialLinkText(value)));
		}

	}

	public static void frameExit() {
		driver.switchTo().defaultContent();
	}

	public static void action(WebElement element, String mouseCondition) {
		Actions action = new Actions(driver);
		if (mouseCondition.equalsIgnoreCase("movetoelement")) {
			action.moveToElement(element).build().perform();
		}

	}

	public static void robot(String type) throws AWTException {
		Robot robot = new Robot();
		if (type.equalsIgnoreCase("down")) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}

		else if (type.equalsIgnoreCase("enter")) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// Alerts

	public static void alert(String condition) {

		if (condition.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (condition.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void waitImplicit(int time, TimeUnit timeunit) {
driver.manage().timeouts().implicitlyWait(time, timeunit);
	}
	
	public static void waitExplicit(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitFluent(int time, TimeUnit timeUnit) {                       //Errors in the below lines
	//	Wait wait = new FluentWait(driver).withTimeout(time, timeUnit));
	//	pollingEvery(5, timeUnit).ignoring(NullPointerException.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static File newFile(String string) {
		return null;
	}

	public static void close() {
		driver.close();
	}

}

//getAttribute
//getfirstselectedoptions
//chckbox
//wait
