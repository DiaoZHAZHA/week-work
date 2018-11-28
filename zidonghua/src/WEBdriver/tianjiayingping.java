package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tianjiayingping {
	@Test
	public void tianjia() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8032/mymovie/";
		driver.get(baseUrl);
		//定位发表评论
		WebElement  search = driver.findElement(By.cssSelector("a[class='desc_btn'][href='/mymovie/index.php/Detail/index/id/38'][title='去评论']"));
		//System.out.println(search.getAttribute("title"));
		Thread.sleep(1000);
		search.click();
		//定位登录
		WebElement search1 = driver.findElement(By.className("thickbox"));
		//System.out.println(search1.getAttribute("title"));
		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
		//输入账号
		WebElement usename = driver.findElement(By.name("username"));
				//cssSelector("input[class='txtbox'][name=['username'][style='width:180px;'][type='text']"));
		Thread.sleep(3000);
		usename.click();
		usename.sendKeys("2016011714");
		//输入密码
		WebElement password = driver.findElement(By.name("password"));
				//cssSelector("input[class='txtbox'] [name=['password'][style='width:180px;'][type='text']"));
		Thread.sleep(3000);
		password.click();
		password.sendKeys("199751");
		WebElement denglu = driver.findElement(By.cssSelector("input[class='txtbox'][name=''][value='马上登录'][type='submit']"));
		Thread.sleep(1000);
		denglu.click();
		
		WebElement  input = driver.findElement(By.id("js_message_textarea"));
				//cssSelector("textarea[id='js_message_textarea'][name='message'][clos='70'][rows='6'][style='resize:none;']"));
		Thread.sleep(3000);
		input.click();
		input.sendKeys("感谢组长的英明领导、不辞辛苦的帮助和组内大佬的照顾提携");
		WebElement submit = driver.findElement(By.id("message_button"));
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(5000);
		//driver.quit();
		
		//循环体发送十条影评。
		/*int a = 1;
		while(a<=10);
		   input.sendKeys("感谢组长的英明领导、不辞辛苦的帮助和组内大佬的照顾");
		   WebElement submit = driver.findElement(By.id("message_button"));
		   Thread.sleep(1000);
		   submit.click();
		   a++;
		   driver.quit();
		  */
		
		
		
		
		
		
		
	}

}
