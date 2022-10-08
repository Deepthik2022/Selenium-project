package julysele22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aug16sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement createbtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createbtn.click();
		//explicit wait(WebDriverWait)
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		WebElement frstName = driver.findElement(By.name("firstname"));
		frstName.sendKeys("Deepthi");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("K");
		}
}
