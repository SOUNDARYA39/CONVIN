package covin;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;



public class Covindraganddrop {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
			
			WebDriver driver= new FirefoxDriver();

			
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		
	/*	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,-500)");
		
		WebElement frame1 = driver.findElement(By.id("Accepted Elements"));
		frame1.click();
		//driver.switchTo().frame(frame1);
		
		//WebElement src = driver.findElement(By.xpath("(//p[text()='Drag me to my target'])[2]"));
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));*/
			
		 driver.get("https://demo.automationtesting.in/Static.html");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(40);
			WebElement src = driver.findElement(By.xpath("(//div[@class='col-xs-10 col-xs-offset-2'])[1]"));
			Thread.sleep(40);
			WebElement dest = driver.findElement(By.id("droparea"));
		
		Actions act = new Actions(driver);
	act.dragAndDrop(src, dest).perform();
		

	}

}
