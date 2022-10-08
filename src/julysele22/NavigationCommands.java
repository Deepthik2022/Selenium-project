package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ebay.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchBox.sendKeys("women clothing");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
	}

}
