package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		mobile.click();
		
		WebElement product = driver.findElement(By.xpath("//div[normalize-space()='Top Headsets from Oneplus, Samsung & More']"));
		product.click();
		
		try {
			WebElement id = driver.findElement(By.xpath("Oneplus Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass - 12.4 Mm Drivers, 10 Mins Charge - 20 Hrs Music, 30 Hrs Battery Life, Launched in April 2022 (Magico Black)"));
			id.click();
				
		} catch (Exception e) {
			System.out.println("success");
		}
		
		driver.navigate().back();
		
		/*Thread.sleep(5000l);
		driver.navigate().back();
		
		/*Thread.sleep(5000l);
		driver.navigate().back();*/
		
		WebElement product2 = driver.findElement(By.linkText("boAt Airdopes 141 True Wireless Earbuds with 42H Playtime, Beast™ Mode(Low Latency Upto 80ms) for Gaming, ENx™ Tech, ASAP™ Charge, IWP™, IPX4 Water Resistance, Smooth Touch Controls(Cyan Cider)"));
		product2.click();
		
		List<WebElement> numberOfWebElements = driver.findElements(By.tagName("span"));
		int size = numberOfWebElements.size();
		System.out.println(size);
		
		
		Thread.sleep(5000l);

		driver.quit();
	}

}
