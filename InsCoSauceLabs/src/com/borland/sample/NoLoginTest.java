package com.borland.sample;

import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.junit.After;

public class NoLoginTest {
	private WebDriver driver;

	@Before
	public void setup() throws MalformedURLException {
		//TODO: Replace property with path to your chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Silk\\Silk WebDriver\\ng\\WebDriversSWD\\Windows\\Chrome\\2.37\\chromedriver.exe");
		// driver = new ChromeDriver();
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "66");
		
		String USERNAME = "maheshmani";
		String ACCESS_KEY = "0629364f-5264-4095-8963-8b6af95fdb63";
		
		driver = new RemoteWebDriver(new URL("https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub"), caps);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void myTestCaseName() {
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		new Select(driver.findElement(By.id("quick-link:jump-menu"))).selectByVisibleText("Auto Quote");
		driver.findElement(By.id("autoquote:zipcode")).sendKeys("94582");
		driver.findElement(By.id("autoquote:e-mail")).sendKeys("a@a.com");
		driver.findElement(By.id("autoquote:vehicle:0")).click();
		driver.findElement(By.id("autoquote:next")).click();
		driver.findElement(By.id("autoquote:age")).clear();
		driver.findElement(By.id("autoquote:age")).sendKeys("47");
		driver.findElement(By.id("autoquote:gender:0")).click();
		driver.findElement(By.id("autoquote:type:0")).click();
		driver.findElement(By.id("autoquote:next")).click();
		driver.findElement(By.id("autoquote:year")).clear();
		driver.findElement(By.id("autoquote:year")).sendKeys("2001");
		driver.findElement(By.id("ext-gen4")).click();
		driver.findElement(By.xpath("//div[text()=\"Toyota\"]")).click();
		driver.findElement(By.id("ext-gen6")).click();
		driver.findElement(By.xpath("//div[text()=\"Camry\"]")).click();
		driver.findElement(By.id("autoquote:finInfo:0")).click();
		driver.findElement(By.id("autoquote:next")).click();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
