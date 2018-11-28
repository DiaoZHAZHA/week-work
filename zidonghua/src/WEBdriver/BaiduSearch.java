package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduSearch {
	public static void main(String[] args) { 
		//火狐geckodriver 驱动的文件路径
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//找到火狐浏览器的应用程序（可以换成别的浏览器 换firefox就可以）
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		//新建火狐的驱动对象
		WebDriver driver = new FirefoxDriver();//new 是新建后面的对象为前面的。 
		//访问链接 
		String baseUrl = "https://www.baidu.com"; 

		driver.get(baseUrl); //访问 baseUrl 为上面的String类型的 baseUrl
		//输出语句 固定语法。 getTitlie 得到网页标题方法  println打印
		System.out.println(driver.getTitle()); 
		//网页闪现然后关闭可先注释driver.quit
//		driver.quit(); //关闭。close关闭当前的浏览器窗口，quit更彻底的close且更好的释放资源。
		 //查找“kw”id元素
		WebElement search = driver.findElement(By.id("kw"));
		 //自动输入淘宝
		 search.sendKeys("淘宝");
		 //WebElement element = driver.findElement(By.id("kw"));
		 WebElement submitButton = driver.findElement(By.id("submit"));
		 submitButton.click();
		// WebElement search1 = driver.findElement(By.className("IXLBbT"));
	} 
		} 
		 
	