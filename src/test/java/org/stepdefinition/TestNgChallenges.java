package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgChallenges extends BaseClasss {
@Test(priority = 4)
private void tc1() {
	launchUrl("https://www.redbus.in/");
	System.out.println("TestCase 1");
}
@Test(priority = -5)
private void tc2() {
	launchUrl("https://inmakesedu.com/");
	System.out.println("TestCase 2");
}
@Test(priority = 6)
private void tc3() {
	System.out.println("TestCase 3");
	launchUrl("https://www.google.com/");	
}
@Test(priority = -4)
private void tc4() {
	System.out.println("TestCase 4");
	launchUrl("https://www.flipkart.com/");	
}
@Test(priority = 1)
private void tc5() {
	System.out.println("TestCase 5");
	launchUrl("https://www.youtube.com/");	
}
@DataProvider(name = "Amazon Data")
private Object[][] datas() {
	return new Object[][] {
		{"shoes"},
		{"Watches"},
		{"Jewels"}
	};

}

@Test (dataProvider = "Amazon Data")
public void tc6(String product) throws AWTException {
	launchUrl("https://www.amazon.in/");
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys(product);
	
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);	
}
@DataProvider(name = "Sample Data")
private Object[][] data() {
	return new Object[][] {
		{"abc@gmail.com","dgsfjddhsgs"},
		{"fgast@gmail.com","cbxvnfgh"}
	};
}
@Parameters 

@Test(dataProvider = "Sample Data")
private void tc7(String e , String pass) {
	System.out.println("Test Case 7");
launchUrl("https://www.facebook.com/");
WebElement email = driver.findElement(By.id("email"));
email.sendKeys(e);
WebElement passwrd = driver.findElement(By.name("pass"));
passwrd.sendKeys(pass);
}
@BeforeClass
private void launchTheBrowser() {
	launchBrowser();
	windowMaximize();
}
@AfterClass
private void closeTheBrowser() {
	closeEntireBrowser();

}
@BeforeMethod
private void startDate() {
	Date d = new Date();
	System.out.println(d);
	}
@AfterMethod
private void EndDate() {
	Date d = new Date();
System.out.println(d);

}
}