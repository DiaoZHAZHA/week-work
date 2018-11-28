package WEBdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jbwyneirong {
	@Test
	public void identifyWindowByPageSource() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.baidu.com";
		driver.get(baseUrl);	
		String pwindowHandle = driver.getWindowHandle();
		System.out.println(pwindowHandle);
		WebElement link=driver.findElement(By.tagName("a"));
		link.click();
		Set<String>allwindowHandles = driver.getWindowHandles();
		if (!allwindowHandles.isEmpty()) {
			for(String windowHandle:allwindowHandles) {
			  if(driver.switchTo().window(windowHandle).getPageSource().contains("百度新闻"));
			    driver.findElement(By.tagName("a")).click();
			    System.out.println("定位到第二个界面");
			  
			}
			
		}
		driver.switchTo().window(pwindowHandle);
        System.out.println(driver.getTitle());	
	}
	
			
}		
	



