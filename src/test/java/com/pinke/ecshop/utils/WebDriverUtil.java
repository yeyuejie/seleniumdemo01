package com.pinke.ecshop.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverUtil {
	private static  ChromeDriverService service;
    static{  service=new ChromeDriverService.Builder()
		  .usingDriverExecutable(new File("D:\\Automation\\webcourse\\selenium\\chromedriver_win32\\chromedriver.exe"))
		  .usingAnyFreePort()
		  .build();
          try {
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
          }
      
        public static WebDriver getDriver(){
        	WebDriver driver=new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
			return driver;
          
        }
        public static void stopService(){
        	service.stop();
        }
}
