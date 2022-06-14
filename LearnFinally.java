package week8.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		try {
			driver.findElement(By.id("username1")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		} finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.ece");
		}
		System.out.println("End of Program");

	}
}