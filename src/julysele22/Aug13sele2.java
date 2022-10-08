package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13sele2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		JavascriptExecutor jk=(JavascriptExecutor)d;
		WebElement email = d.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		//email.sendKeys("deepthikarnam256@gmail.com");
		jk.executeScript("arguments[0].setAttribute('value','deepthikarnam256@gmail.com')",email);
		WebElement password = d.findElement(By.xpath("//input[@type='password']"));
		jk.executeScript("arguments[0].setAttribute('value','Achyutha@12')",password);
		WebElement logbtn = d.findElement(By.xpath("//button[@name='login']"));
		jk.executeScript("arguments[0].click()", logbtn);
		String userName = email.getAttribute("value");
		System.out.println(userName);
		
	}

}