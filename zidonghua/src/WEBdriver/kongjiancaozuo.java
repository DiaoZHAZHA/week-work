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
	//输入框和单击按钮
	public void  inputText()throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.baidu.com";
		driver.get(baseUrl);
		WebElement input = driver.findElement(By.id("kw"));
		//input.clear();
		Thread.sleep(3000);//延迟3000毫秒再进行操作
		input.sendKeys("hello");
		input.getText();
		//input.submit();//这一步和下面的按钮操作内容一样。
		//Thread.sleep(3000);
		WebElement button = driver.findElement(By.id("su"));
        button.click();
        //下拉框的操作
        Select dropList = new Select
                (driver.findElement(By.name("fruit")));//元素定位问题 pdf中的定位元素网页中中不到
       //Thread.sleep(3000);
       assertFalse(dropList.isMultiple());//是否允许多选
       assertEquals(dropList.getFirstSelectedOption().getText(),"桃子");
       dropList.selectByIndex(2);//0表示第一个选项
       assertEquals(dropList.getFirstSelectedOption().getText(),"桔子");
       dropList.selectByValue("西瓜");
       dropList.selectByVisibleText("猕猴桃");
		
		
	}
}


	//@Test//单个跑程序的问题
    //下拉框
//	public void operateDropList() {
    	//System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		//WebDriver driver = new FirefoxDriver();
		//String baseUrl = "http://www.baidu.com";
		//driver.get(baseUrl);
       // Select dropList = new Select
                 //(driver.findElement(By.name("wu")));//元素定位问题 pdf中的定位元素网页中中不到
        //Thread.sleep(3000);
        //assertFalse(dropList.isMultiple());//是否允许多选
        //assertEquals(dropList.getFirstSelectedOption().getText(),"桃子");
        //dropList.selectByIndex(2);//0表示第一个选项
        //assertEquals(dropList.getFirstSelectedOption().getText(),"桔子");
        //dropList.selectByValue("西瓜");
        //dropList.selectByVisibleText("猕猴桃");
        
        
    	
    //}

//}
