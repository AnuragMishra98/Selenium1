package learning_Select_Class;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_SingleSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
		 driver.get("https://www.demo Dropdown.com");
		 WebElement dropdownElement = driver.findElement(By.id("month"));
		 Select dropdown = new Select(dropdownElement);

	}

}
