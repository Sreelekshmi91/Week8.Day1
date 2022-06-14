package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.myntra.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//a[text()='Men']"));

		Actions builder = new Actions(driver);
		builder.contextClick(element).perform();
	}
}
