package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifeTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();

		WebElement txtLocations = driver.findElement(By.xpath("html/body/header/div[2]/div[1]/nav/ul/li[1]/a"));
		System.out.println(txtLocations.getText());
		txtLocations.click();

		WebElement txtLocate = driver
				.findElement(By.xpath("html/body/header/div[2]/div/nav/ul/li[1]/div[2]/ul/li[2]/a"));
		System.out.println(txtLocate.getText());

		WebElement txtViewAllLoc = driver
				.findElement(By.xpath(" html/body/header/div[2]/div[1]/nav/ul/li/div/ul/li[3]/a"));
		System.out.println(txtViewAllLoc.getText());

		WebElement txtComingSoon = driver
				.findElement(By.xpath(" html/body/header/div[2]/div[1]/nav/ul/li/div/ul/li[4]/a"));
		System.out.println(txtComingSoon.getText());

		System.out.println();
		WebElement txtMembership = driver.findElement(By.xpath("html/body/header/div[2]/div[1]/nav/ul/li[2]/a"));
		txtMembership.click();

		WebElement txtBenefits = driver.findElement(By.xpath("//li[@class='nav-item  dropdown open']"));
		System.out.println(txtBenefits.getText());

		System.out.println();
		WebElement txtExplore = driver.findElement(By.xpath("html/body/header/div[2]/div[1]/nav/ul/li[3]/a"));
		System.out.println(txtExplore.getText());
		txtExplore.click();
		WebElement txtClasses = driver.findElement(By.xpath("//ul[@class='list-unstyled dropdown-columns']"));
		System.out.println(txtClasses.getText());

		driver.quit();

	}
}