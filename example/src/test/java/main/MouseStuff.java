package main;

import static org.junit.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseStuff {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void draw() throws InterruptedException {
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver);
		WebElement canvas = driver.findElement(By.id("catch"));
		action.moveToElement(canvas).click().perform();
		action.moveToElement(canvas).moveByOffset(-100, 0).click().perform();
		action.clickAndHold(canvas).moveByOffset(200, 0).perform();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
