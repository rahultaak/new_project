package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

public class log {
	
	public static void take_log(String classname,String message)
	{
		DOMConfigurator.configure("E:\\selenium\\Hitachi_Project\\layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
		
	}

}
