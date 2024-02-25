 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWeb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\95\\95\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	
	
	//webpage on internet , localmachine ,localserver
//1.	internet
//	wd.get("https://www.amazon.in/");		
//	
//	System.out.println(wd.getTitle());
//	System.out.println(wd.getCurrentUrl());
	//web-elements
	
	//BY ID
//	wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");
//	wd.findElement(By.id("nav-search-submit-button")).click();
	
	//BY XPATH
//	wd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus mobile");
//	wd.findElement(By.id("nav-search-submit-button")).click();
	
	//BY LINK
	//we can also search by partial link text,but not preferred cos it can be multiple 
//	wd.findElement(By.partialLinkText("Start")).click();
	
//	wd.findElement(By.linkText("Start here.")).click();	//we click on links to go there
//	wd.findElement(By.id("ap_customer_name")).sendKeys("neha");
//	wd.findElement(By.id("ap_phone_number")).sendKeys("7987521885");
//	wd.findElement(By.id("ap_password")).sendKeys("neha310");
////.submit() can be used in forms instead of .click(),,or this-->sendKeys(Keys.ENTER);
//	wd.findElement(By.id("continue")).sendKeys(Keys.ENTER);
	
	
	
//2. 	localmachine
//	wd.get("file:///C:/Users/ASUS/Desktop/Forms.html");	
//	wd.findElement(By.name("sid")).sendKeys("011");
//	wd.findElement(By.id("female")).click();		//for radio & checkbox
//	wd.findElement(By.name("cricket")).click();
//	
//				//for drop-downs
//	Select sc=new Select(wd.findElement(By.name("Subjects")));
//	List<WebElement> list=sc.getOptions();	//Retrieve data from drop down
//	for(WebElement ss:list) {
//		System.out.println(ss.getText());
//	}
//	
//	sc.selectByValue("java");			//for drop-down
//	
//	
//	System.out.println(wd.getTitle());
//	System.out.println(wd.getCurrentUrl());
//	
//3.	 localserver--it will work only if other project's tomcat is on
//	wd.get("http://localhost:8080/WebSeleniumViaServer/Forms.html");
//	System.out.println(wd.getTitle());
//	System.out.println(wd.getCurrentUrl());
//	Thread.sleep(2000);
		
//4.		In case of alert boxes which is not web-element.
	
//	 //webpage level time bound
//  	 wd.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
//  	 wd.get("file:///C:/Users/ASUS/Desktop/alert.html");
//  	 wd.findElement(By.name("submit")).click();
//	Alert alert=wd.switchTo().alert();
//	System.out.println(alert.getText()); 	//to see alert's message	
//	Thread.sleep(2000);
//	alert.accept();	//yes --> accept; no-->dismiss
	
	
//			In case of desktop level(like uploading)
	
	//logic
	//wd.close();
}
}
