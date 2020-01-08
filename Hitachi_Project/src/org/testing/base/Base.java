package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	
	
@BeforeMethod
public void browser_lounch() throws IOException
{
	
	File f = new File("E:\\selenium\\Hitachi_Project\\obj.properties");
	FileInputStream fi = new FileInputStream(f);
	pr = new Properties();
	pr.load(fi);
	
	System.setProperty("webdriver.chrome.driver", "E:\\testing software\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://hisysmc.flexiele.com");
}

@AfterMethod
public void browser_close()
{
	driver.close();
	
}
	

}
