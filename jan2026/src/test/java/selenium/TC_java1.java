package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_java1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        WebDriverManager.edgedriver().setup();
		
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		search.sendKeys("Test Methods");
//		search.submit();
		
//		WebElement searchbutton = driver.findElement(By.name("btnK"));
//				searchbutton.click();
				
//				System.out.println("Title is: "+driver.getTitle());
//				driver.close();
				
				WebDriverManager.firefoxdriver().setup();
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://tutorialsninja.com/demo/index.php?");
				String title=driver.getTitle();
				System.out.println("title"+title);
				driver.findElement(By.linkText("My Account")).click();
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
				String msg = 	driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).getText();		
				System.out.println("Error is :" + msg);
				driver.close();
//				WebElement sr=dr.findElement(By.id("APjFqb"));
//				sr.sendKeys("Test Methods");
//				sr.submit();
	}
}
