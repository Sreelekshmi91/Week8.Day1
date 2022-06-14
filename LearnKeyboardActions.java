package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeyboardActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
//		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
//		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
//		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));

		Actions builder = new Actions(driver);

		builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL).perform();

		// builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).click(item7).keyUp(Keys.CONTROL).perform();

		// builder.dragAndDropBy(source, 150, 200).perform();
	}
}
