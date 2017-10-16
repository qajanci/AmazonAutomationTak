package com.amazon.in;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverManager {

    public static WebDriver driver;

        public void openBrowser() throws IOException
        {
            ChromeDriverManager.getInstance().setup();
                driver= new ChromeDriver();
            driver.get("https://www.amazon.co.uk");
                driver.manage().window().maximize();
        }

    public void closeBrowser()
        {
            driver.quit();
        }
}
