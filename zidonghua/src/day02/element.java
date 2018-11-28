package day02;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class element {
	@Test

	public  void elemnTest() throws InterruptedException { 
		//火狐geckodriver 驱动的文件路径
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//找到火狐浏览器的应用程序（可以换成别的浏览器 换firefox就可以）
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		//新建火狐的驱动对象
		WebDriver driver = new FirefoxDriver();//new 是新建后面的对象为前面的。 
		//访问链接 
		String baseUrl = "https://www.baidu.com"; 

		driver.get(baseUrl);
		///**
		 //* web网站功能怎么测试 --通过鼠标去网页上找到元素《输入框、按钮、超链接、图片等》
		 //* 操作元素《输入内容、点击-鼠标和键盘的操作》通过selenium操作
		 //* 需编程和驱动  元素的查找和定位操作
		 //*/
		//driver.findElement(By.)//(找单个元素by 通过什么的样的方式找元素)
		//一  id:唯一标识 
		//WebElement input = driver.findElement(By.id("kw"));
		//input.getAttribute("maxlength");//获得后面的属性在控制台
		//System.out.println("maxlength");
		//driver.findElements(By.)//（找多个元素）
		//二  name
		//driver.findElement(By.name("wd"));//抓到前端数据提交后端的标识。
		//三  通过html标签名定位元素  很多 所以用数组来收集 一般用的少
		//List<WebElement> elements = driver.findElements(By.tagName("input"));
		//System.out.println(elements.size());//输出数组长度
		//四   可能有多个  但是只会找第一个
		//driver.findElement(By.className("s_ipt"));
		//五  超链接的文本 就是网页上的可点击的文字
		//WebElement aElement = driver.findElement(By.linkText("学术"));
		//aElement.click();//点击这个超链接
		//六  以超链接的部分文本来定位 也是得到一个超链接并且点击
		//WebElement aelement = driver.findElement(By.partialLinkText("术"));
		//aelement.click();
		//七  用的最多的方式 ----样式选择器
		//("标签名（可能会有很多）[属性名=属性值][属性名2=属性值2][属性值3=属性值3]....")
		//多条件的筛选
		//单属性  先定位然后输入
		//WebElement input  = driver.findElement(By.cssSelector("input[maxlength='255']"));
		//System.out.println(input.getAttribute("class"););
		//输入框的操作---->输入内容
		//input.sendkeys("柠檬班");
		//八  xpath--->路径定位 （绝对路径和相对路径） 火狐上有firepath插件需要安装
		//通过工具 检查元素 右击 copy--->选择
		WebElement input = driver.findElement(By.xpath(""));
		input.sendKeys("柠檬班");
		//编码后再元素定位。
		
		
		
		Thread.sleep(5000);
		driver.quit();

//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
