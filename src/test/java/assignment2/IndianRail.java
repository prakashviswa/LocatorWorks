package assignment2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loc.Base;

public class IndianRail {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Base b =new Base();
		driver.get("https://enquiry.indianrail.gov.in/ntes/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//li[@class='ui-tabs-tab ui-corner-top ui-state-default ui-tab'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.id("station1")).sendKeys("CHENNAI CENTRAL", (Keys.DOWN));
		Thread.sleep(500);
		driver.findElement(By.id("station2")).sendKeys("COIMBATORE JN");
		Thread.sleep(500);
		b.keyDown();
		b.keyEnter();
		driver.findElement(By.id("trnBwStnsGoBtn")).click();
		depTime("10:10");
		

	}
	private static void depTime(String dep) {
		String dtime = "//table[@id='directTbltrnBwStns1551112287545']/tbody/tr/td[7]/span[text()='$']";
		dtime = dtime.replace("$", dep);
		driver.findElement(By.xpath(dtime)).click();
	}

}