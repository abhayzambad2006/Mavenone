package Operators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class login {
	public static WebDriver driver;

	public void loginUser(String username,String password) {
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"username\"]//following::input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\"username\"]//following::button[@type=\"submit\"]")).click();
		
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		login login_new = new login();
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		//Put Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open the link
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//Check web page loaed successfully
		String acc_Title= driver.getTitle();
		String exp_Title = "OrangeHRM";
		if(acc_Title.equals(exp_Title)) {
			System.out.println("Web Page loaded successfully.");
		}
		else
		{
		System.out.println("Page not loaded");
		
		
		}
		
		//Entr user name and password
		
		
		login_new.loginUser("Admin","admin123");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name=\"username\"]//following::input[@name=\"password\"]")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name=\"username\"]//following::button[@type=\"submit\"]")).click();
		
		String acc_value = "";
		
		try {
		 acc_value=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		System.out.println(acc_value);}
		
		catch(NoSuchElementException e){
			
			acc_value="";
			System.out.println("Try to login again");
			login_new.loginUser("Admin","admin123");
		}
		String exp_Value = "Dashboard";
		Thread.sleep(5000);
		if(acc_value.equalsIgnoreCase(exp_Value)) 
		
		{
			System.out.println("Test Case pass");
		}
		else
			System.out.println("Test Case fail");
		
		//Back from Page
		driver.navigate().back();
		
		//Using FindWebelements, find out multiple url on pages
		driver.get("https://www.amazon.in/");
		List <WebElement> NoOfUrl=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Url on the page is:"+NoOfUrl.size());
		
		//Find out number of images
		
		List<WebElement>Images=driver.findElements(By.tagName("img"));
		System.out.println("No of Images on the page is: " +Images.size());
		//System.out.println("No of Images on the page is: " +Images.toString());
		
		//findout drop down value
		
		driver.navigate().back();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		WebElement  month= driver.findElement(By.name(("birthday_month")));
		//create object for dropdown
		Select dropDown = new Select(month);
		//convert it intoarray
		List<WebElement>res=dropDown.getOptions();		
		int size =res.size();

		System.out.println("No of month: "+size);
		
		/*
		 * for(int i=0;i<size;i++) {
		 * 
		 * String name = res.get(i).getText(); //System.out.println(name);
		 * 
		 * 
		 * }
		 */
		
		
		for(WebElement a:res) {

			System.out.println(a.getText());
			
		}
		driver.quit();
	}

}
