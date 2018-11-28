package WEBdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jubing {

	@Test
	public void controlWindow() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8032/mymovie/";
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		//wd.get("http://localhost:8032/mymovie/");
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.baidu.com/')");
		Set<String>windows = driver.getWindowHandles();
		for (String s:windows) {
			System.out.println(s);
			boolean status = driver.switchTo().window(s).getTitle().contains("mymovie");
			if(status) {
				driver.findElement(By.linkText("µÇÂ¼")).click();
			}
			
			
		}
		
		
	}

	
		
		
		
	}



