package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_defination
{
    // new instance of chrome driver
    public static WebDriver driver= new ChromeDriver();
    public  void  Setup() {
        //delete all cookies
        driver.manage().deleteAllCookies();

        //set the size of window
        driver.manage().window().setSize(new Dimension(1482, 256));

        //set window position
         //driver.manage().window().setSize(new Point(100,100));

        //maximize the window
        driver.manage().window().maximize();

        //To close driver
        //driver.quit();
       // driver.close();
    }
}
