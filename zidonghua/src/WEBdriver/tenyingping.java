package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tenyingping {
	@Test
	public static void pinglun() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8032/mymovie/";
		driver.get(baseUrl);
		//定位发表评论
		Thread.sleep(1000);
		WebElement  search = driver.findElement(By.cssSelector("a[class='desc_btn'][href='/mymovie/index.php/Detail/index/id/38'][title='去评论']"));
		Thread.sleep(1000);
		search.click();
		//定位登录
		WebElement search1 = driver.findElement(By.className("thickbox"));
		Thread.sleep(1000);
		search1.click();
		//登录账号
		WebElement usename = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		usename.click();
		usename.sendKeys("2016011714");
		//输入密码
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		password.click();
		password.sendKeys("199751");
		WebElement denglu = driver.findElement(By.cssSelector("input[class='txtbox'][name=''][value='马上登录'][type='submit']"));
		denglu.click();
		
		/*WebElement  input = driver.findElement(By.id("js_message_textarea"));
		Thread.sleep(3000);
		input.click();
		*/
		int a = 1;
		while(a<=10) {
		WebElement  input = driver.findElement(By.id("js_message_textarea"));
          Thread.sleep(3000);
           input.click();
           Thread.sleep(1000);
		   input.sendKeys("感谢组长的英明领导、不辞辛苦的帮助和组内大佬的照顾");
		   Thread.sleep(1000);
		   WebElement submit = driver.findElement(By.id("message_button"));
		   Thread.sleep(1000);
		   submit.click();
		   a++;
		}
		Thread.sleep(5000);
        driver.quit();		
	}

}
