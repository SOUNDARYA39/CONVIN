package covin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getCURRENTURL {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://www.amazon.in");
		 driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		
		String page = driver.getCurrentUrl();
		System.out.println(page);
		

	}

}
