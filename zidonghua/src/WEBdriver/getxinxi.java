package WEBdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//获取页面信息
public class getxinxi {
	String baseUrl="http://www.baidu.com";
	@Test//不能和main函数共存。
	public void getpage() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();//新建对象
		driver.get(baseUrl);
		String title=driver.getTitle();//获得标题
		String pageSource = driver.getPageSource();//获得源代码	
		String pageUrl = driver.getCurrentUrl();
		System.out.println(title+pageSource+pageUrl);
		}
	}


