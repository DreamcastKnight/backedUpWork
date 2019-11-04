package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingWebsite {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	@Ignore
	public void getDress() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		search.sendKeys("dress");
		WebElement submitSearch = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		submitSearch.submit();
		assertEquals("nope.", "In stock",
				driver.findElement((By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/span/span")))
						.getText());
		// Thread.sleep(6000);
	}

	@Test
	public void buyDress() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		search.sendKeys("dress");
		WebElement submitSearch = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		submitSearch.submit();
		Thread.sleep(2000);
		WebElement submitAddToCart = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
		submitAddToCart.click();
		Thread.sleep(2000);
		WebElement addItFam = driver.findElement(
				By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[3]/div/p/button"));
		addItFam.click();
		Thread.sleep(2000);
		WebElement takeMeToCheck = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		takeMeToCheck.click();
		Thread.sleep(2000);
		WebElement finalCheckOut = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
		finalCheckOut.click();
		Thread.sleep(2000);
		WebElement user = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
		user.sendKeys("HeyYouYoureFinallyAwake@crossingtheborder.com");
		WebElement pass = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
		pass.sendKeys("buggy");
		Thread.sleep(2000);
		WebElement signIn = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button"));
		signIn.submit();
		Thread.sleep(2000);
		
	}

	@After
	public void tearDown() {
		driver.close();
	}
}