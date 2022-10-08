package julysele22;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aug13sele1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("iphones X");
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		WebElement firstOption = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)')]"));
		Actions a=new Actions(driver);
		a.moveToElement(firstOption).contextClick().perform();
		Robot r=new Robot();
		for (int i = 1; i <=2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			}
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String x : windowHandles) {
			if (!par.equals(x) ) {
				driver.switchTo().window(x);
			}
		}
		/*WebElement price = driver.findElement(By.xpath("//span[text()='$329.00'][1]"));
		String text = price.getText();
		System.out.println(text);*/
		
		String price="329";
		int parseInt = Integer.parseInt(price);
if (parseInt>=200) {
	System.out.println("product is greater than 20k");
}



	
	}

}
