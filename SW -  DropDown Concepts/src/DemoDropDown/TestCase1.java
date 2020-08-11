package DemoDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);

		WebElement option = month_dd.getFirstSelectedOption();
		String monthindex = option.getText();
		System.out.println(monthindex);
		month_dd.selectByIndex(12);

		WebElement option1 = month_dd.getFirstSelectedOption();
		String monthindex1 = option1.getText();
		System.out.println(monthindex1);
		Thread.sleep(10000);
	}
}