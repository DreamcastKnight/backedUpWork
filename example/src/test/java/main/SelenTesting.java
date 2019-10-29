package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenTesting {
	WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("test 001");
		driver.get("https:www.google.com");
		Thread.sleep(2000);
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
}
