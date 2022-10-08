package julysele22;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug14sele1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//type casting
		TakesScreenshot tk=(TakesScreenshot)driver;
		//taking screenshot and storing in default location
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		//create new file
		File desc = new File("C:\\Users\\Achyutha\\pratice\\practice.txt");
		boolean createNewFile = desc.createNewFile();
		System.out.println(createNewFile);
		//copy from source to destination
		//FileUtils.copyFile(src, desc);
		boolean mkdir = desc.mkdirs();
		System.out.println(mkdir);
		FileUtils.write(desc, "welcome to java class");
		FileUtils.write(desc, "in greens technology",true);
	}
}
