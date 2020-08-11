
/*Case Study – Handling Drop Down Box items/List box items:
	
     1.User TestNG/Junit Framework and Open URL By any browsers
			a.	Chrome Browser
			b.	Firefox
			c.	Internet Explorer
	 2. Open URL: https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=
	 3.	Select the option Month "Aug" from the drop-down menu
	 4.	Use Different option of select class and print values
	 5. Count number of list items in drop down box and print in console
     6.	Close the Browser

*/

package DemoDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDropDown {
	@Test
	public void BrowserCommands() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.manage().window().maximize();

		Select dropdownCity = new Select(driver.findElement(By.id("state")));
		dropdownCity.selectByVisibleText("California");

		List<WebElement> state_list = dropdownCity.getOptions();
		int total_month = state_list.size();
		System.out.println("Total State count in List : " + total_month);

		for (WebElement ele : state_list) {
			String month_name = ele.getText();
			System.out.println("State Names in DropDownlist.... :" + month_name);

		}
		driver.quit();
	}
}