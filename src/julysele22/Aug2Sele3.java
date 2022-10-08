package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aug2Sele3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout'][1]"));
		Actions a=new Actions(driver);
		a.moveToElement(all).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		Thread.sleep(5000l);
		WebElement paint2 = driver.findElement(By.xpath("//a[@title='Interior Paint']"));
		a.moveToElement(paint2).perform();
		Thread.sleep(5000l);
		WebElement paint3 = driver.findElement(By.xpath("//a[@title='Ceiling Paint']"));
		paint3.click();
		
		
	
	}

}
