package WEBdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//��ȡҳ����Ϣ
public class getxinxi {
	String baseUrl="http://www.baidu.com";
	@Test//���ܺ�main�������档
	public void getpage() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver = new FirefoxDriver();//�½�����
		driver.get(baseUrl);
		String title=driver.getTitle();//��ñ���
		String pageSource = driver.getPageSource();//���Դ����	
		String pageUrl = driver.getCurrentUrl();
		System.out.println(title+pageSource+pageUrl);
		}
	}


