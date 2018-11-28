package WEBdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//访问 baseUrl的地址  地址可以随时切换。
public class webdrive {
	String baseUrl="http://www.baidu.com";
	@Test//不能和main函数共存。
	public void visitURL() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);}//上面三行是对driver的声明，必须写。
//返回、前进和刷新。
    public void visitRecentURL() {
    	System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
			driver.get(baseUrl);
		    driver.get(baseUrl);
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			Dimension  size=new Dimension(300,400);
		     driver.manage().window().setSize(size);
			}
		//driver.manage()window().maximize();浏览器最大化
	   //设置浏览器的大小
	    
	}
	
	


