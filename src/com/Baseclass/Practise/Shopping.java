package com.Baseclass.Practise;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.baseclass.Base_class;
import com.automation.pom.Home_Page;

public class Shopping extends Base_class {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// WebElement login_btn = driver.findElement(By.xpath("//a[@class='login']"));
		Home_Page home = new Home_Page(driver);

		clickOnElement(home.getSignin_Btn());

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		inputValueElement("kamalesh1@gmail.com", email);

		WebElement paswd = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputpassword("123456", paswd);

		WebElement submit_btn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span/i"));
		clickOnElement(submit_btn);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']")));

		WebElement dress = driver.findElement(By.xpath(("(//a[@title='Dresses'])[2]")));
		clickOnElement(dress);

		WebElement summer = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		clickOnElement(summer);

		WebElement quickV = driver.findElement(By.xpath("//a[@class='product_img_link'][1]"));
		clickOnElement(quickV);
		driver.switchTo().frame(0);

		WebElement addquant = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		addquant.click();

		WebElement size = driver.findElement(By.id("group_1"));
		// Select sc1 = new Select(size);
		// sc1.selectByValue("3");

		dropdown(size, "byvalue", "L");

		WebElement color = driver.findElement(By.xpath("//a[@title='Black']"));
		clickOnElement(color);

		WebElement addtocart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		clickOnElement(addtocart);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		WebElement addcart1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(addcart1);

		WebElement pcheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(pcheckout);

		WebElement addrs = driver.findElement(By.name("processAddress"));
		clickOnElement(addrs);

		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(check);

		WebElement process = driver.findElement(By.name("processCarrier"));
		clickOnElement(process);

		WebElement pay1 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(pay1);

		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(submit1);

		WebElement backtoorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickOnElement(backtoorder);

		WebElement home1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[2]"));
		clickOnElement(home1);

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']")));

		WebElement dressS = driver.findElement(By.xpath(("(//a[@title='Dresses'])[2]")));
		clickOnElement(dressS);

		WebElement summerdress = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		clickOnElement(summerdress);

		WebElement quickView = driver.findElement(By.xpath("(//a[@class='product_img_link'])[3]"));
		clickOnElement(quickView);
		driver.switchTo().frame(0);

		WebElement addquanty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickOnElement(addquanty);

		WebElement sizee = driver.findElement(By.id("group_1"));
		// Select sc2 = new Select(sizee);
		// sc2.selectByValue("2");
		dropdown(sizee, "byvalue", "M");

		WebElement colour = driver.findElement(By.xpath("//a[@title='Green']"));

		clickOnElement(colour);

		WebElement addcart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		clickOnElement(addcart);

		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(checkout);

		WebElement pcheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(pcheckout2);

		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(btn);

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(checkbox);

		WebElement prtocheck = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(prtocheck);

		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickOnElement(cheque);

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(confirm);

		WebElement back2 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickOnElement(back2);

		WebElement mouse = driver.findElement(By.id("block-history"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouse);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\KKAMALESHRAJ\\eclipse-workspace\\Automation_Practise\\Screenshot\\miniproj.png");
		FileUtils.copyFile(source, destination);

		WebElement logout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(logout);

	}

}
