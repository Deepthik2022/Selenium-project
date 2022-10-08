package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug18sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("table"));
		int size = list.size();
		System.out.println(size);
		
		WebElement table1 = list.get(0);
		String text = table1.getText();
		System.out.println(text);
		
		WebElement table2 = list.get(1);
		String text2 = table2.getText();
		System.out.println(text2);
		List<WebElement> tableRow1 = table2.findElements(By.tagName("td"));
		for (WebElement tdata : tableRow1) {
			String text3 = tdata.getText();
			System.out.println(text3);
		}
		WebElement tRow1 = tableRow1.get(2);
		String text3 = tRow1.getText();
		System.out.println(text3);
		
		}

	}


