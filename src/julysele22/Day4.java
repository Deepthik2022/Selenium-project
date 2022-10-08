package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'leading Training')]"));
		String text = para.getText();
		System.out.println(text);
		
	}

}
