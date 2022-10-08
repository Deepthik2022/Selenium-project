package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July2022Sele implements TestSele {

	@Override
	public void empName() {
		System.out.println("emp name is Deepthi ");		
	}

	@Override
	public void empId() {
		System.out.println("emp id is 858251");		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		July2022Sele j=new July2022Sele();
		
		
		driver.get("https://www.amazon.in/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		int length = driver.getTitle().length();
		System.out.println(length);
		
		int length2 = driver.getPageSource().length();
		System.out.println(length2);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Television");
		
		WebElement enterBtn = driver.findElement(By.id("nav-search-submit-button"));
		enterBtn.click();
		
		List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(numberOfLinks.size());
		
		for (WebElement i : numberOfLinks) {
			System.out.println(i.getText());
		}
		
		String b="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//String b= "Android";
		
		boolean c = b.equalsIgnoreCase(title);
		System.out.println(c);
		
		
		if (c==true) 
		{
			
			WebElement product = driver.findElement(By.linkText("Redmi 80 cm (32 inches) Android 11 Series HD Ready Smart LED TV | L32M6-RA/L32M7-RA (Black)"));
			product.click();
			
		} else {
			driver.quit();
			j.empName();
			j.empId();
		}
		Thread.sleep(5000l);
		driver.quit();

		}


}
