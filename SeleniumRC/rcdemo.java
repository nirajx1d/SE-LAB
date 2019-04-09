package pack;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class rcdemo {
	public static void main(String[] args) {
		Selenium selenium =new DefaultSelenium("localhost",4444,"*googlechrome","http://www.google.co.in");
		Selenium selenium1 =new DefaultSelenium("localhost",4444,"*googlechrome","http://www.gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium1.start();
		selenium1.open("/");
		selenium1.windowMaximize();

	}

}
