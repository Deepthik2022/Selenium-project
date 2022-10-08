package julysele22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aug2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		
		driver.manage().window().maximize();
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest1 = driver.findElement(By.className("placeholder"));
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source1, dest1).perform();
		a.dragAndDrop(source2, dest2).perform();
	}

}
