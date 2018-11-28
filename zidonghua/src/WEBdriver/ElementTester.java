package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementTester {


	@Test
  public void elementTest() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
	  System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.baidu.com");
	  WebElement input = driver.findElement(By.id("kw"));
	  input.getAttribute("maxlength");
	  System.out.println(input.getAttribute("maxlength"));
	  Thread.sleep(5000);
	  driver.quit();
	  
	  
	  
	  
  }
}
