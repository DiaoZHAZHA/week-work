package WEBdriver;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class kongjiancaozuo {
	@Test
	//�����͵�����ť
	public void  inputText()throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.baidu.com";
		driver.get(baseUrl);
		WebElement input = driver.findElement(By.id("kw"));
		//input.clear();
		Thread.sleep(3000);//�ӳ�3000�����ٽ��в���
		input.sendKeys("hello");
		input.getText();
		//input.submit();//��һ��������İ�ť��������һ����
		//Thread.sleep(3000);
		WebElement button = driver.findElement(By.id("su"));
        button.click();
        //������Ĳ���
        Select dropList = new Select
                (driver.findElement(By.name("fruit")));//Ԫ�ض�λ���� pdf�еĶ�λԪ����ҳ���в���
       //Thread.sleep(3000);
       assertFalse(dropList.isMultiple());//�Ƿ������ѡ
       assertEquals(dropList.getFirstSelectedOption().getText(),"����");
       dropList.selectByIndex(2);//0��ʾ��һ��ѡ��
       assertEquals(dropList.getFirstSelectedOption().getText(),"����");
       dropList.selectByValue("����");
       dropList.selectByVisibleText("⨺���");
		
		
	}
}


	//@Test//�����ܳ��������
    //������
//	public void operateDropList() {
    	//System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		//WebDriver driver = new FirefoxDriver();
		//String baseUrl = "http://www.baidu.com";
		//driver.get(baseUrl);
       // Select dropList = new Select
                 //(driver.findElement(By.name("wu")));//Ԫ�ض�λ���� pdf�еĶ�λԪ����ҳ���в���
        //Thread.sleep(3000);
        //assertFalse(dropList.isMultiple());//�Ƿ������ѡ
        //assertEquals(dropList.getFirstSelectedOption().getText(),"����");
        //dropList.selectByIndex(2);//0��ʾ��һ��ѡ��
        //assertEquals(dropList.getFirstSelectedOption().getText(),"����");
        //dropList.selectByValue("����");
        //dropList.selectByVisibleText("⨺���");
        
        
    	
    //}

//}
