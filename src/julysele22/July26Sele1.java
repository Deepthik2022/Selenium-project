package julysele22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*how to print the windowHandle values, difference between GetWindowHandle 
and GetWindowHandles, switch to other windows, navigate to page,close all the windows.*/

public class July26Sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle is "+parentWindowHandle);
		
		//WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		//newWindow.click();
		
		for (int i = 1; i <= 3; i++) {
			WebElement newWindow=driver.findElement(By.xpath("//button[@id='windowButton']"));
			newWindow.click();

		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		for (String string : windowHandles) {
			
			System.out.println("window handles are "+string);
			
			driver.switchTo().window(string);
			driver.navigate().to("https://www.google.com");
			driver.manage().window().maximize();
		}
		driver.switchTo().window(parentWindowHandle);
		driver.close();
		
		String lastWindow="";
		driver.switchTo().window(lastWindow);
		driver.quit();
		
	}

}
