package WEBdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//���� baseUrl�ĵ�ַ  ��ַ������ʱ�л���
public class webdrive {
	String baseUrl="http://www.baidu.com";
	@Test//���ܺ�main�������档
	public void visitURL() {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);}//���������Ƕ�driver������������д��
//���ء�ǰ����ˢ�¡�
    public void visitRecentURL() {
    	System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
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
		//driver.manage()window().maximize();��������
	   //����������Ĵ�С
	    
	}
	
	


