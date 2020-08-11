/*Case Study – Handling Drop Down Box items/List box items:
	
     1.User TestNG/Junit Framework and Open URL By any browsers
			a.	Chrome Browser
			b.	Firefox
			c.	Internet Explorer
	 2. Open URL: https://www.facebook.com/
	 3.	Select the option Month "Aug" from the drop-down menu
	 4.	Use Different option of select class and print values
     5.	Close the Browser
*/


package DemoDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookDemo {
	@Test
	public void FBlaunch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
		// WebElement str=month_dd.getFirstSelectedOption();

		month_dd.selectByIndex(3);
		Thread.sleep(10000);
		month_dd.selectByValue("9");
		Thread.sleep(10000);
		month_dd.selectByVisibleText("Aug");
		Thread.sleep(10000);

	}
}
