package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class assignment {

	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\M1074287\\eclipse-workspace\\demoproject\\target\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("cap");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@class='_bXVsd_image_1pfbQ']")).click();
		
	}
}
