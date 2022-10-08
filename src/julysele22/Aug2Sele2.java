package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aug2Sele2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement womFash = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(womFash).perform();
		WebElement heel = driver.findElement(By.xpath("//span[text()='Heels']"));
		heel.click();
	}

}
