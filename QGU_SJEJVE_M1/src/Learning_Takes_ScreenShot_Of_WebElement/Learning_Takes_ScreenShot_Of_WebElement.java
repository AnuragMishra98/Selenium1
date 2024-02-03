package Learning_Takes_ScreenShot_Of_WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Learning_Takes_ScreenShot_Of_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.get("http://ananta/login.do");
		
		WebElement loginButton = driver.findElement(By.xpath("(//tbody)[3]"));
		File source = loginButton.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/webelementSS.png");
		FileHandler.copy(source, destination);
	}

}
