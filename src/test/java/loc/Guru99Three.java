package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Three {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\Works1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();

		WebElement txtBigData = driver
				.findElement(By.xpath("//li[contains(@class,'fa fa-chevron-circle-right')]/child::a[contains(@href,'/bigdata-tutorials.html')]"));
		System.out.println(txtBigData.getText());

		WebElement txtHBase = driver
				.findElement(By.xpath("//li[contains(@class,'fa fa-chevron-circle-right')]/child::a[contains(@href,'/hbase-tutorials.html')]"));
		System.out.println(txtHBase.getText());

		WebElement txtMongo = driver
				.findElement(By.xpath("//ul[@class='menu' or@id='java_technologies' and @style='list-style-type: none;margin-left: 0.5rem;margin-top:0px;margin-bottom:0px;']/child::li/a[@href='/mongodb-tutorials.html']"));
		System.out.println(txtMongo.getText());

		WebElement txtHive = driver
				.findElement(By.xpath("//a[@target='_top' and @title='Hive' ]"));
		System.out.println(txtHive.getText());

		WebElement txtCassandra = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[4]/div/ul[1]/li[5]/a[1]"));
		System.out.println(txtCassandra.getText());

		WebElement txtAWS = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[4]/div/ul[1]/li[5]//following::a"));
		System.out.println(txtAWS.getText());

		WebElement txtDataWare = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[4]/div/ul[1]/li[7]/a[1]"));
		System.out.println(txtDataWare.getText());

		WebElement txtDev = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[4]/div/ul[1]/li[8]//child::a"));
		System.out.println(txtDev.getText());

		WebElement txtTableau = driver
				.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[4]/div/ul[1]/li[9]"));
		System.out.println(txtTableau.getText());

		driver.quit();

	}
}
