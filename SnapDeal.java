package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.snapdeal.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//span[@class='catText']"));

		Actions builder = new Actions(driver);

		builder.moveToElement(element).pause(Duration.ofSeconds(2))
				.click(driver.findElement(By.xpath("//span[text()='Shirts']"))).perform();

		WebElement elementwish = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));

		builder.moveToElement(elementwish).pause(Duration.ofSeconds(2))
				.click(driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"))).perform();

	}
}
