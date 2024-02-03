package Learning_JavaScript_Exceutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Action_On_Disabled_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.skillrary.com/");
		
		//driver.findElement(By.path("//input[@class='form-control']")).sendKeys("aman");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//JavascriptExecutor js = (JavascriptExceutor) driver;
		js.executeScript("argument[0].value='aman'", driver.findElement(By.xpath("//input[@class='form-control']")));
	}

}
