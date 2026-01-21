package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_findelements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(10000);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		driver.quit();
		
	}
}
