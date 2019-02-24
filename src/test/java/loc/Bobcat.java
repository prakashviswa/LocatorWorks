package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bobcat {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bobcat.com");
		driver.manage().window().maximize();
		
		WebElement clkAccept = driver
				.findElement(By.xpath("//strong[contains(text(),'Accept and Close')]"));
		clkAccept.click();
		
		WebElement txtSkidSteer = driver
				.findElement(By.xpath("//a[@class='text-uppercase text-center has-sub dtm-pro-grp-txt-name']"));
		System.out.println(txtSkidSteer.getText());
		txtSkidSteer.click();
		
		
		WebElement txtSkidSteerLoader= driver
				.findElement(By.xpath("(//div[contains(@class,'h5 dtm-pro-grp-lst-name')])[1]"));
		System.out.println(txtSkidSteerLoader.getText());
		
		driver.quit();
}
}
