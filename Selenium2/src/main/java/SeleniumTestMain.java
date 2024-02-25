import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestMain {
public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\95\\95\\chromedriver.exe");
	WebDriver wb=new ChromeDriver();
	wb.manage().window().maximize();
	
	wb.get("http://localhost:8080/Selenium2/index.html");
	Thread.sleep(4000);
	//insert-->checking h1 content with expected result
//	wb.findElement(By.name("user")).sendKeys("neha");
//	Thread.sleep(4000);
//	wb.findElement(By.name("submit")).submit();
//	Thread.sleep(4000);
//	String actualResult=wb.findElement(By.name("h1")).getText();
//	String expectedResult="Success";
//	if(actualResult.equals(expectedResult)) {
//		System.out.println("Test Case Passed!!");
//	}
//	else {
//		System.out.println("Test Case Failed!!");
//	}
	
	
	
	//checking h1 as well as retrieved last inserted value from db
	 String expecteddbvalue="neeta";
   	 wb.findElement(By.name("user")).sendKeys(expecteddbvalue);
   	 Thread.sleep(2000);
   	 wb.findElement(By.name("submit")).submit();
   	 Thread.sleep(2000);
   	 String actualresult=wb.findElement(By.name("h1")).getText();
   	 String expectedresult="Success";
   	
   	 String sql="select * from User";
   	 Connection con=DBUtil.dbConn();
   	 PreparedStatement ps=con.prepareStatement(sql);
   	 ResultSet rs=ps.executeQuery();
   	 String actualvalue="";
   	 while(rs.next()) {
   		 actualvalue=rs.getString(1);
   	 }
   	 
   	//Testing with conditional statements
   	 if(actualresult.equals(expectedresult)&&actualvalue.equals(expecteddbvalue)) {
   		 System.out.println("testcase passed");
   	 }
   	 else {
   		 System.out.println("testcase failed");
   	 } 
	
	
}
}
