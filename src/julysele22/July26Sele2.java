package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class July26Sele2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
			WebElement dropDown = driver.findElement(By.xpath("//select[@id='day']"));
			Select select=new Select(dropDown);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			System.out.println("No.of options present are "+size);
			
			for (WebElement actualOptions : options) {
				System.out.println(actualOptions.getText());
			}
			//select.selectByIndex(9);
			//select.selectByValue("11");
			select.selectByVisibleText("11");

			driver.quit();
		}


}
