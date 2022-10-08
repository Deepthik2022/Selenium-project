package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//auto suggestion
public class July26Sele4 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.cleartrip.com/register");
driver.manage().window().maximize();

WebElement userName = driver.findElement(By.xpath("//input[@id='username1']"));
userName.click();
userName.sendKeys("deepthikarnam256@gmail.com");

WebElement checkBox = driver.findElement(By.xpath("//form[@id='registerForm']//input[@id='mkt_sbpt']"));
checkBox.click();

WebElement createBtn = driver.findElement(By.xpath("//button[@id='registerButton']"));
createBtn.click();

driver.navigate().refresh();

		driver.navigate().to("https://www.cleartrip.com/trains");
		
		WebElement from = driver.findElement(By.id("from_station"));
		from.click();
		from.sendKeys("Chennai");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(5000l);
		
		WebElement to = driver.findElement(By.xpath("//input[@id='to_station']"));
		to.click();
		to.sendKeys("Hyderabad");
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		}

}
