package org.testing.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.utilities.Screenshot;
import org.testing.utilities.log;
import org.testng.annotations.Test;

public class TC1 extends Base {
	
	@Test
	public void login() throws IOException
	{
		WebElement userid = driver.findElement(By.xpath(pr.getProperty("userid")));
		userid.sendKeys("M5685");
		
		WebElement pass = driver.findElement(By.xpath(pr.getProperty("pass")));
		pass.sendKeys("rahul@8800");
		
		WebElement submit = driver.findElement(By.xpath(pr.getProperty("submit")));
		submit.click();
		
	Screenshot.take_screenshot(driver, "C:\\Users\\RAHUL TAAK\\Desktop\\login.png");
	log.take_log("TC1", "logged in Successfully ");
			
	}

}
