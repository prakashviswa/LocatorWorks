package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FastSpeed {
	public static void main(String[] args) throws InterruptedException {

		Base b = new Base();
		WebDriver driver = b.getChromeDriver();
		b.loadUrl("https://fast.com/");
		Thread.sleep(10000);
		WebElement txtSpeed = driver
				.findElement(By.xpath("//div[@class='speed-results-container succeeded' and @id='speed-value']"));
		b.getText(txtSpeed);

	}
}