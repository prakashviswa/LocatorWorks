package loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NetFlix {
	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver = b.getChromeDriver();
		b.loadUrl("https://media.netflix.com/en/");
		WebElement txtLogin = driver.findElement(By.xpath("(//i[@class='fa fa-sign-in']//parent::a)[1]"));
		b.btnclick(txtLogin);

		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='user_email' and @name='pf.username']"));
		b.type(txtEmail, "prakash@viswa.com");

		WebElement txtPassword = driver
				.findElement(By.xpath("//input[@id='user_email' and @name='pf.username']//following::input"));
		b.type(txtPassword, "123456789");

		WebElement txtSignIn = driver.findElement(By.xpath(
				"//input[@id='user_email' and @name='pf.username']//following::input//following::div[2]/a[1]/span"));
		b.btnclick(txtSignIn);

		WebElement validate = driver.findElement(By.xpath("//div[@class='ping-error']"));
		Assert.assertEquals("We didn't recognize the username or password you entered. Please try again.", validate);

		driver.quit();

	}
}
