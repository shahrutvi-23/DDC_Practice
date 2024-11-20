package org.example;

import org.openqa.selenium.By;

public class Openurl extends webdriver_defination
{
    public static void main(String[] args)
    {
         Openurl();
         OpenOrglist();


    }

    static void Openurl()
 {
     driver.get("http://ddcqa.alliancetek.net/Home");
     driver.findElement(By.id("Email")).sendKeys("atekqaprajesh@yahoo.com");
     driver.findElement(By.id("password")).sendKeys("Test@123");
     driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
 }
 static void OpenOrglist()
 {
    driver.findElement(By.cssSelector("#main-menu > li:nth-child(8) > a")).click();
 }
}
