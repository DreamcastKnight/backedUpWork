package main;

import static org.junit.Assert.assertEquals;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class FTSE {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void buyDress() throws InterruptedException {
		driver.get("https://www.phptravels.net/");
		WebElement clickDestination = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[1]/div/div[2]/div"));
		clickDestination.click();
		WebElement typeDestination = driver
				.findElement(By.xpath("/html/body/div[4]/div/input"));
		typeDestination.sendKeys("London");
		WebElement chooseDestination =(new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/ul"))); 
		chooseDestination.click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
		Files.copy(scrFile, );
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
