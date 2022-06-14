package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFluentWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.leafground.com/pages/appear.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(250))
				.ignoring(Exception.class);

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='btn']//b[1]"))));
		String text = driver.findElement(By.xpath("//button[@id='btn']//b[1]")).getText();
		System.out.println(text);
	}
}
