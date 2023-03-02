package Operators;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteAndRelativeXpath {

	public static void main(String[] args) throws Exception {

		// Step 1. Set the property to launch Chrome.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rakes\\eclipse-workspace\\MaySelenium\\drivers\\chromedriver.exe");

		// Step 2. Launch the empty browser.

		WebDriver driver = new ChromeDriver();

		// Step 3. navigate to Facebook.com

		driver.get("https://www.facebook.com/");

		// Maximize the window
		driver.manage().window().maximize(); // method Chaining

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		String str = driver.findElement(By.tagName("h2")).getText();
		System.out.println(str);
		
		driver.navigate().to("https://amazon.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Books")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Today's D")).click();

		// An Absolute Xpath For clicking over the mobiles
		/*
		 * WebElement mobiles = driver.findElement(By.xpath(
		 * "//div[@id='nav-xshop']/a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"
		 * ));
		 */

		// The relative xpath for mobiles -

		// driver.findElement(By.linkText("Best Sellers")).click();

		/*
		 * On facebook.com WebElement email = driver.findElement(By.name("pass"));
		 * Thread.sleep(2000); email.sendKeys("I have entered the value");
		 */

		// Learning about xpath functions -

		// text() function
		// WebElement mobiles = driver.findElement(By.xpath("//a[text() = ' Electronics
		// ']"));
		// mobiles.click();
	}

}
