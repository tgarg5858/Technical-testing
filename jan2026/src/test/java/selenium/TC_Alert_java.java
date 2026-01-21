package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;




public class TC_Alert_java {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.letcode.in/alert");

        dr.findElement(By.id("accept")).click();
    	
    	Alert simplealert=dr.switchTo().alert();
    	System.out.println("Simple alert text: "+simplealert.getText());
    	simplealert.accept();
    	Thread.sleep(1000);
    	
    	dr.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
    	
    	Alert ar2=dr.switchTo().alert();
    	System.out.println("Confirm alert text: " + ar2.getText());
    	ar2.accept();
    	
    	Thread.sleep(1000);
    	
    	dr.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
    	Alert ar3= dr.switchTo().alert();
    	System.out.println("prompt aler text: "+ ar3.getText());
    	ar3.accept();
    }

}
