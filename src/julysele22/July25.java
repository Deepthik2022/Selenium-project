package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July25 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("admin123");
		
		driver.navigate().refresh();
		
		try {
			driver.findElement(By.xpath("//input[@id='txtUsername")).clear();
			
			driver.findElement(By.id("txtPassword")).clear();
			
			
			} catch (Exception e) {
			System.out.println("success");		
}
		WebElement logInBtn = driver.findElement(By.id("btnLogin"));
		logInBtn.click();
		
		WebElement getText = driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));
		String text = getText.getText();
		System.out.println(text);
		
		WebElement getLocation = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Point location = getLocation.getLocation();
		System.out.println("x cordinates are "+location.x);
		System.out.println("y coordinates are "+location.y);

		
		WebElement getSize = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Dimension size = getSize.getSize();
		System.out.println("height is "+size.height);
		System.out.println("width is "+size.width);
		
		WebElement getTagName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		String tagName = getTagName.getTagName();
		System.out.println("tag name is "+tagName);
	
		List<WebElement> size1 = driver.findElements(By.tagName("a"));
		int size2 = size1.size();
		System.out.println("number of links on webpage "+size2);
		
		WebElement logInBtn2 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		boolean displayed = logInBtn2.isDisplayed();
		System.out.println("log in button is displayed "+displayed);
		
		WebElement logInBtn3 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		boolean enabled = logInBtn3.isEnabled();
		System.out.println("log in button is enabled "+enabled);
		
		WebElement logInBtn4 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		boolean selected = logInBtn4.isSelected();
		System.out.println("log in button is selected "+selected);
		
		driver.quit();
	}
	

}

























