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
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8032/mymovie/";
		driver.get(baseUrl);
		//��λ��������
		WebElement  search = driver.findElement(By.cssSelector("a[class='desc_btn'][href='/mymovie/index.php/Detail/index/id/38'][title='ȥ����']"));
		//System.out.println(search.getAttribute("title"));
		Thread.sleep(1000);
		search.click();
		//��λ��¼
		WebElement search1 = driver.findElement(By.className("thickbox"));
		//System.out.println(search1.getAttribute("title"));
		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
		//�����˺�
		WebElement usename = driver.findElement(By.name("username"));
				//cssSelector("input[class='txtbox'][name=['username'][style='width:180px;'][type='text']"));
		Thread.sleep(3000);
		usename.click();
		usename.sendKeys("2016011714");
		//��������
		WebElement password = driver.findElement(By.name("password"));
				//cssSelector("input[class='txtbox'] [name=['password'][style='width:180px;'][type='text']"));
		Thread.sleep(3000);
		password.click();
		password.sendKeys("199751");
		WebElement denglu = driver.findElement(By.cssSelector("input[class='txtbox'][name=''][value='���ϵ�¼'][type='submit']"));
		Thread.sleep(1000);
		denglu.click();
		
		WebElement  input = driver.findElement(By.id("js_message_textarea"));
				//cssSelector("textarea[id='js_message_textarea'][name='message'][clos='70'][rows='6'][style='resize:none;']"));
		Thread.sleep(3000);
		input.click();
		input.sendKeys("��л�鳤��Ӣ���쵼����������İ��������ڴ��е��չ���Я");
		WebElement submit = driver.findElement(By.id("message_button"));
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(5000);
		//driver.quit();
		
		//ѭ���巢��ʮ��Ӱ����
		/*int a = 1;
		while(a<=10);
		   input.sendKeys("��л�鳤��Ӣ���쵼����������İ��������ڴ��е��չ�");
		   WebElement submit = driver.findElement(By.id("message_button"));
		   Thread.sleep(1000);
		   submit.click();
		   a++;
		   driver.quit();
		  */
		
		
		
		
		
		
		
	}

}
