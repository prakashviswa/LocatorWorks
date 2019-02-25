package loc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yahoo {
	static WebDriver driver;

	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver = b.getChromeDriver();
		b.loadUrl("https://in.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='uh-search-box' and @type='text']")).sendKeys("Selenium greens",
				Keys.ENTER);
		goToPage("4");
	}

	private static void goToPage(String pageNum) {
		List<WebElement> cols = driver.findElements(By.xpath("//input[@id='uh-search-box' and @type='text']"));
		for (int i = 0; i < cols.size(); i++) {
			if (cols.get(i).getText().equals(pageNum)) {
				cols.get(i).findElement(By.tagName("a")).click();
				break;

			}
		}
	}
}