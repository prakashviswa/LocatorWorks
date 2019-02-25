package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile phones", Keys.ENTER);
		goToMobile("5");
	}

	private static void goToMobile(String itemNum) {
		List<WebElement> mobNumber = driver
				.findElements(By.xpath("//div[@id='merchandised-content']//div[@class='crwTitle']"));
		for (int i = 0; i < mobNumber.size(); i++) {
			if (mobNumber.get(i).getText().equals(itemNum)) {
				mobNumber.get(i).findElement(By.tagName("div")).click();

				break;

			}
			driver.quit();
		}
	}
}