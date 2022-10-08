package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class July27Sele2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement killBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		killBtn.click();
		
		WebElement logIn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		logIn.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("8247462374");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		passWord.sendKeys("Achyutha@12");
		
		WebElement enterBtn = driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]"));
		enterBtn.click();
		
		Actions a = new Actions(driver);

		WebElement home = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		a.moveToElement(home).perform();
		
		WebElement home2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[1]"));
		a.moveToElement(home2).perform();
		
		Thread.sleep(2000l);
		WebElement bedLinen = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]"));
		bedLinen.click();
	
	}

}
