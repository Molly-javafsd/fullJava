package com.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
  @Test
  public void test1() {
	  WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		SoftAssert sf=new SoftAssert();
		wd.get("https://www.google.com/");
		String title=wd.getTitle();
		sf.assertEquals("Google",title,"title not matched");
	System.out.println("done");
	sf.assertEquals("https://www.google.com/", wd.getCurrentUrl(),"url not matched");
	System.out.println("done2");
	sf.assertAll();
	wd.quit();
  }
  @Test
  public void test2() {
	  WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		wd.quit();
  }
}
