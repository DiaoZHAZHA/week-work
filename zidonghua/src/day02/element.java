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
		//���geckodriver �������ļ�·��
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//�ҵ�����������Ӧ�ó��򣨿��Ի��ɱ������� ��firefox�Ϳ��ԣ�
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		//�½��������������
		WebDriver driver = new FirefoxDriver();//new ���½�����Ķ���Ϊǰ��ġ� 
		//�������� 
		String baseUrl = "https://www.baidu.com"; 

		driver.get(baseUrl);
		///**
		 //* web��վ������ô���� --ͨ�����ȥ��ҳ���ҵ�Ԫ�ء�����򡢰�ť�������ӡ�ͼƬ�ȡ�
		 //* ����Ԫ�ء��������ݡ����-���ͼ��̵Ĳ�����ͨ��selenium����
		 //* ���̺�����  Ԫ�صĲ��ҺͶ�λ����
		 //*/
		//driver.findElement(By.)//(�ҵ���Ԫ��by ͨ��ʲô�����ķ�ʽ��Ԫ��)
		//һ  id:Ψһ��ʶ 
		//WebElement input = driver.findElement(By.id("kw"));
		//input.getAttribute("maxlength");//��ú���������ڿ���̨
		//System.out.println("maxlength");
		//driver.findElements(By.)//���Ҷ��Ԫ�أ�
		//��  name
		//driver.findElement(By.name("wd"));//ץ��ǰ�������ύ��˵ı�ʶ��
		//��  ͨ��html��ǩ����λԪ��  �ܶ� �������������ռ� һ���õ���
		//List<WebElement> elements = driver.findElements(By.tagName("input"));
		//System.out.println(elements.size());//������鳤��
		//��   �����ж��  ����ֻ���ҵ�һ��
		//driver.findElement(By.className("s_ipt"));
		//��  �����ӵ��ı� ������ҳ�ϵĿɵ��������
		//WebElement aElement = driver.findElement(By.linkText("ѧ��"));
		//aElement.click();//������������
		//��  �Գ����ӵĲ����ı�����λ Ҳ�ǵõ�һ�������Ӳ��ҵ��
		//WebElement aelement = driver.findElement(By.partialLinkText("��"));
		//aelement.click();
		//��  �õ����ķ�ʽ ----��ʽѡ����
		//("��ǩ�������ܻ��кࣩܶ[������=����ֵ][������2=����ֵ2][����ֵ3=����ֵ3]....")
		//��������ɸѡ
		//������  �ȶ�λȻ������
		//WebElement input  = driver.findElement(By.cssSelector("input[maxlength='255']"));
		//System.out.println(input.getAttribute("class"););
		//�����Ĳ���---->��������
		//input.sendkeys("���ʰ�");
		//��  xpath--->·����λ ������·�������·���� �������firepath�����Ҫ��װ
		//ͨ������ ���Ԫ�� �һ� copy--->ѡ��
		WebElement input = driver.findElement(By.xpath(""));
		input.sendKeys("���ʰ�");
		//�������Ԫ�ض�λ��
		
		
		
		Thread.sleep(5000);
		driver.quit();

//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
