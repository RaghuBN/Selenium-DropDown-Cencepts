package DemoDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);

		// String Item=month_Dropdown.getText();
		// System.out.println(Item);

		List<WebElement> month_list = month_dd.getOptions();
		int total_month = month_list.size();
		System.out.println("Total months count in List : " + total_month);

		for (WebElement ele : month_list) {
			String month_name = ele.getText();
			System.out.println("Month Names in DropDownlist.... :" + month_name);

		}
		driver.quit();
	}
}
