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
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8032/mymovie/";
		driver.get(baseUrl);
		//��λ��������
		Thread.sleep(1000);
		WebElement  search = driver.findElement(By.cssSelector("a[class='desc_btn'][href='/mymovie/index.php/Detail/index/id/38'][title='ȥ����']"));
		Thread.sleep(1000);
		search.click();
		//��λ��¼
		WebElement search1 = driver.findElement(By.className("thickbox"));
		Thread.sleep(1000);
		search1.click();
		//��¼�˺�
		WebElement usename = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		usename.click();
		usename.sendKeys("2016011714");
		//��������
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		password.click();
		password.sendKeys("199751");
		WebElement denglu = driver.findElement(By.cssSelector("input[class='txtbox'][name=''][value='���ϵ�¼'][type='submit']"));
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
		   input.sendKeys("��л�鳤��Ӣ���쵼����������İ��������ڴ��е��չ�");
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
