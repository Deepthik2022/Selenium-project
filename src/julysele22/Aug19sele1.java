package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug19sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement opt1 = driver.findElement(By.id("vfb-7-1"));
		opt1.click();
		boolean selected = opt1.isSelected();
		System.out.println(selected);
		
		WebElement ckbox3 = driver.findElement(By.id("vfb-6-2"));
		ckbox3.click();
		WebElement ckbox2 = driver.findElement(By.id("vfb-6-1"));
		ckbox2.click();
	}

}
