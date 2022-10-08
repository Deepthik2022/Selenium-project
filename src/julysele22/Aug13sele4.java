package julysele22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13sele4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		WebElement okCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		okCancel.click();
		WebElement btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btn.click();
		Thread.sleep(2000l);
		Alert a=driver.switchTo().alert();
		//a.accept();
		a.dismiss();
	}

}
