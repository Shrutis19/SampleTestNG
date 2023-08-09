package practiceTestNG;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTest1 {
	
	@BeforeMethod(alwaysRun=true)
	public void testBefore() {
		
		System.out.println("Before method");
	}
	
	@Test(invocationCount=3)
	public void test1() {
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.google.com/");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.findElement(By.className("gLFyf")).sendKeys("maven repository");
		 * driver.findElement(By.className("gNO89b")).click();
		 * driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click(); String title
		 * = driver.getTitle(); System.out.println(title); driver.quit();
		 */
		 
		System.out.println("Test1");
		Assert.assertTrue(false);
	}
	
	@Test(priority=0, invocationCount=2, groups= {"smoke"}, dependsOnMethods="test1")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=1, groups="sanity")
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups={"smoke"}, dependsOnMethods="test2")
	public void test4() {
		System.out.println("Test 4");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod(){
		System.out.println("After Method");
	}
}
