package julysele22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July27Sele1 {
	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achyutha\\eclipse-workspace\\22JulySele\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://money.rediff.com/gainers");
				
				driver.manage().window().maximize();
				
				//Xpath Axes
				//self node
				WebElement selfNode = driver.findElement(By.xpath("//a[contains(.,'Shoppers Stop')]"));
				String s = selfNode.getText();
				System.out.println("selfnode is "+s);
				selfNode.click();
				Thread.sleep(5000l);

					//parent node
					WebElement parentNode= driver.findElement(By.xpath("//a[contains(.,'Shoppers Stop')]/parent::td"));
					String p=parentNode.getText();
					System.out.println("parentnode is "+p);
					
					//ancestorNode
					WebElement ancestorNode = driver.findElement(By.xpath("//a[contains(.,'Shoppers Stop')]/ancestor::tr"));
					String a = ancestorNode.getText();
					System.out.println("ancestornode is "+a);
					
					//childNode
					List<WebElement> childNodes = driver.findElements(By.xpath("//a[contains(.,'Shoppers Stop')]/ancestor::tr/child::*"));
					int size = childNodes.size();
					System.out.println("number of child nodes are "+size);
					
					for (WebElement i : childNodes) {
						System.out.println(i.getText());
					}
					
					//followingNodes
					List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(.,'Shoppers Stop')]/following::*"));
					System.out.println(followingNodes.size());
					
					//following-sibling
					List<WebElement> followingSibling= driver.findElements(By.xpath("//a[contains(.,'Shoppers Stop')]/following-sibling::*"));
					System.out.println(followingSibling.size());
					
					List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(.,'Shoppers Stop')]/ancestor::tr/preceding-sibling::*"));
					int size2 = precedingSibling.size();
					System.out.println(size2);
					
					List<WebElement> precedingNodes = driver.findElements(By.xpath("//a[contains(.,'Shoppers Stop')]/ancestor::tr/preceding::*"));
					System.out.println(precedingNodes.size());
					
												
				Thread.sleep(5000l);
				//xpath of dynamic web elements
				//https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp
				/*WebElement passWord = driver.findElement(By.xpath("//input[@name='Passwd']/self::input"));
				passWord.sendKeys("iusdig");*/
				
				}
			

		

	}


