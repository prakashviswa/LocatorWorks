package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99PageOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		WebElement txtTesting = driver
				.findElement(By.xpath("/html/body/div[2]/section[3]/div/div/div/div/div/div/div/div/div/h4/b"));
		System.out.println(txtTesting.getText());

		WebElement txtLivePrj = driver
				.findElement(By.xpath("/html/body/div[2]/section[3]/div/div/div/div/div/div/div/div/div/h4[2]/b"));
		System.out.println(txtLivePrj.getText());

		WebElement txtPerf = driver
				.findElement(By.xpath("/html/body/div[2]/section[3]/div/div/div/div/div/div/div/div/div/h4[3]/b"));
		System.out.println(txtPerf.getText());

		WebElement txtSAP = driver.findElement(By.xpath("//div[@class='featured-box']/h4/b"));
		System.out.println(txtSAP.getText());

		WebElement txtDefect = driver.findElement(By.xpath("//div[@class='featured-box']/h4[2]/b"));
		System.out.println(txtDefect.getText());

		WebElement txtEnterprise = driver.findElement(By.xpath("//*[text()='Enterprise Testing']"));
		System.out.println(txtEnterprise.getText());

		WebElement txtAI = driver.findElement(By.xpath("(//div[@class='col-md-3']/div)[3]/h4/b"));
		System.out.println(txtAI.getText());

		WebElement txtWeb = driver.findElement(By.xpath("(//div[@class='col-md-3']/div)[3]/h4[2]"));
		System.out.println(txtWeb.getText());

		WebElement txtTestManag = driver.findElement(By.xpath("//b[contains(text(),'Test Mana')]"));
		System.out.println(txtTestManag.getText());

		WebElement TxtBigData = driver.findElement(By.xpath("(//div[contains(@class,'col-md-3')])[4]/div/h4/b"));
		System.out.println(TxtBigData.getText());

		WebElement txtMustLearn = driver
				.findElement(By.xpath("(//ul[@class='menu' and @id='java_technologies'])[10]//following::h4/b"));
		System.out.println(txtMustLearn.getText());

		driver.quit();

	}
}
