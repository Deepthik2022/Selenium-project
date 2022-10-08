package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class July26Sele3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select select=new Select(box);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (WebElement names : options) {
			System.out.println(names.getText());
		}
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		
		select.selectByIndex(0);
		select.selectByValue("orange");
		select.selectByVisibleText("Grape");

		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		Thread.sleep(5000l);
		select.deselectAll();
		
		driver.quit();
	}

}
