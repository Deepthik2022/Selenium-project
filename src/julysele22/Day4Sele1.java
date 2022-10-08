package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement userTxt = driver.findElement(By.xpath("//input[@id='username']"));
		userTxt.sendKeys("deepthikarnam256@gmail.com");
		String attribute = userTxt.getAttribute("value");
		System.out.println(attribute);
	}

}
