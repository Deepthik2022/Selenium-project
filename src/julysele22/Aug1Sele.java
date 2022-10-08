package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug1Sele {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
	}

}
