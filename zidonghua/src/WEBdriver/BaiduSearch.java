package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduSearch {
	public static void main(String[] args) { 
		//���geckodriver �������ļ�·��
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//�ҵ�����������Ӧ�ó��򣨿��Ի��ɱ������� ��firefox�Ϳ��ԣ�
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		//�½��������������
		WebDriver driver = new FirefoxDriver();//new ���½�����Ķ���Ϊǰ��ġ� 
		//�������� 
		String baseUrl = "https://www.baidu.com"; 

		driver.get(baseUrl); //���� baseUrl Ϊ�����String���͵� baseUrl
		//������ �̶��﷨�� getTitlie �õ���ҳ���ⷽ��  println��ӡ
		System.out.println(driver.getTitle()); 
		//��ҳ����Ȼ��رտ���ע��driver.quit
//		driver.quit(); //�رա�close�رյ�ǰ����������ڣ�quit�����׵�close�Ҹ��õ��ͷ���Դ��
		 //���ҡ�kw��idԪ��
		WebElement search = driver.findElement(By.id("kw"));
		 //�Զ������Ա�
		 search.sendKeys("�Ա�");
		 //WebElement element = driver.findElement(By.id("kw"));
		 WebElement submitButton = driver.findElement(By.id("submit"));
		 submitButton.click();
		// WebElement search1 = driver.findElement(By.className("IXLBbT"));
	} 
		} 
		 
	