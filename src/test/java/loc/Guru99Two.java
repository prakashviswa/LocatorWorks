package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();

		WebElement txtSoftwareTesting = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li/a"));
		System.out.println(txtSoftwareTesting.getText());

		WebElement txtQuickTestProf = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/a"));
		System.out.println(txtQuickTestProf.getText());

		WebElement txtSelenium = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/a"));
		System.out.println(txtSelenium.getText());

		WebElement txtMobileAppTest = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/a"));
		System.out.println(txtMobileAppTest.getText());

		WebElement txtcucum = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/a"));
		System.out.println(txtcucum.getText());

		WebElement txtSoap = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/a"));
		System.out.println(txtSoap.getText());

		WebElement txtAgileTest = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[7]/a"));
		System.out.println(txtAgileTest.getText());

		WebElement txtJunit = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[8]/a"));
		System.out.println(txtJunit.getText());

		WebElement txtRPA = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/div/ul/li[9]/a"));
		System.out.println(txtRPA.getText());

		driver.quit();

	}
}
