package loc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium greens", Keys.ENTER);
		goToPageNew("4");
		goToPage("6");
	}

	private static void goToPageNew(String pageNum) {
		String locator = "//a[@aria-label='Page $']";
		locator = locator.replace("$", pageNum);
		driver.findElement(By.xpath(locator)).click();
	}

	private static void goToPage(String pageNum) {
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='nav']//td"));

		// List<WebElement> cols
		// =driver.findElements(By.xpath("//table[@id='nav']/tbody/tr/td"));
		// This is also works.

		for (int i = 0; i < cols.size(); i++) {
			if (cols.get(i).getText().equals(pageNum)) {
				cols.get(i).findElement(By.tagName("a")).click();
				break;

			}
		}
		//driver.quit();
	}

}
