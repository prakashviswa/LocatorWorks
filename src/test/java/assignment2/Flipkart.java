package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobile phones", Keys.ENTER);
		goToMobile("5");
	}

	private static void goToMobile(String itemNum) {
		List<WebElement> mobNumber = driver
				.findElements(By.xpath("(//div[@class='_1HmYoV _35HD7C'])[2]/div/div/div/div"));
		for (int i = 0; i < mobNumber.size(); i++) {
			if (mobNumber.get(i).getText().equals(itemNum)) {
				mobNumber.get(i).findElement(By.tagName("a")).click();
				break;
			}
			driver.quit();
		}
	}
}
