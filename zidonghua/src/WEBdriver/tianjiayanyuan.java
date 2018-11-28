package WEBdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tianjiayanyuan {
	@Test
	public void yanyuan() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/Mymovie/admin.php/Login/index.html\r\n" + 
				"");
		//Thread.sleep(3000);
		WebElement usename = driver.findElement(By.name("username"));
		Thread.sleep(1000);
		usename.click();
		usename.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(1000);
		password.click();
		password.sendKeys("admin");
		Thread.sleep(1000);
		//WebElement denglu = driver.findElement(By.cssSelector("input[class='sub'][value=''][type='submit']"));
		WebElement denglu = driver.findElement(By.className("sub"));
		Thread.sleep(1000);
		denglu.click();
		Thread.sleep(3000	);
		//定位影片管理
		WebElement yingpian = driver.findElement(By.xpath("//h2[contains(.,'Folder影片管理')]"));
		Thread.sleep(1000);
		yingpian.click();
		Thread.sleep(1000);
		//定位演员管理
		WebElement actor1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[6]/ul/li[2]/div/div[1]"));
		Thread.sleep(3000);
		actor1.click();
		WebElement actor2 = driver.findElement(By.cssSelector("a[target='navTab'][rel='listactor'][title='添加演员信息']"));
		Thread.sleep(1000);
		actor2.click();
		WebElement name = driver.findElement(By.name("cname"));
		Thread.sleep(1000);
		name.click();
		name.sendKeys("张国荣");
		WebElement ename = driver.findElement(By.id("ename_8938"));
		Thread.sleep(1000);
		ename.click();
		ename.sendKeys("Leslie Cheung");
		WebElement sex = driver.findElement(By.cssSelector("input[value='1'][name='sex'][type='radio']"));
		Thread.sleep(1000);
		sex.click();
		WebElement xingzuo = driver.findElement(By.cssSelector("a[class='required'][href='javascript:'][name='constellation'][value='']"));
		Thread.sleep(1000);
		xingzuo.click();
		WebElement  xuanze = driver.findElement(By.cssSelector("a[class=''][href='#'][value='处女座']"));
		Thread.sleep(1000);
		xuanze.click();
		WebElement brith = driver.findElement(By.name("birthday"));
		Thread.sleep(1000);
		brith.click();
		brith.sendKeys( "1956年9月12日");
		WebElement place = driver.findElement(By.name("bornaddress"));
		Thread.sleep(1000);
		place.click();
		place.sendKeys("香港九龙");
		WebElement professtion = driver.findElement(By.name("professtion"));
		Thread.sleep(1000);
		professtion.click();
		professtion.sendKeys("演员、歌手、音乐人");
		//定位头像
		//WebElement picture = driver.findElement
		
//		/html/body/div[1]/div[2]/div[2]/div[2]/div[6]/ul/li[2]/div/div[1]
		WebElement introduction = driver.findElement(By.className("editMode"));
		Thread.sleep(1000);
		introduction.click();
		introduction.sendKeys("中国香港男歌手、演员、音乐人；"
				+ "影视歌多栖发展的代表之一。1977年正式出道。"
				+ "1983年以《风继续吹》成名。"
				+ "1984年演唱的《Monica》是香港歌坛第一支同获十大中文金曲、十大劲歌金曲的舞曲。");
		WebElement baocun = driver.findElement(By.linkText("baocun"));
		Thread.sleep(1000);
		baocun.click();
		
		
		
		
		
		
		
		
	}

}
