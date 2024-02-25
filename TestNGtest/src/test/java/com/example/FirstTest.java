package com.example;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
  @Test
  public void test1() {
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.com/");
	String title=wd.getTitle();
	assertEquals("Google", title,"title not matched");
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
