package Task003;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginempty {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("login-button")).click();
				

	}
}
