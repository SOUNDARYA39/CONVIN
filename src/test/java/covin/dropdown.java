package covin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.spi.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
	
	
		//WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		WebDriverWait wp = new WebDriverWait(driver, Duration.ofSeconds(100));
		Thread.sleep(100);
		WebElement all = driver.findElement(By.xpath("//select[@id='searchDropdownBox' and @title='Search in']"));
		Thread.sleep(100);
		wp.until(ExpectedConditions.elementToBeClickable(all));
		
		all.click();
		
	Select sel=new Select(all);
	
	List<WebElement> options = sel.getOptions();
	
	for(int i=0;i<options.size();i+=2)
	{
		for(WebElement ele:options)
		{
			String print = ele.getText();
			System.out.println(print);
		}
	}

	}

}
