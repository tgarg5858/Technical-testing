package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_find2 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?");
        driver.findElement(By.partialLinkText("Account")).click();
        driver.findElement(By.partialLinkText("Regist")).click();
        driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Saritha");
        driver.quit();
    }

}
