package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.leafground.com/pages/Dropdown.html ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(10000);
		WebElement item1 = driver
				.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option"));
		WebElement item2 = driver
				.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[5]"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item2).keyUp(Keys.CONTROL).perform();

	}
}
