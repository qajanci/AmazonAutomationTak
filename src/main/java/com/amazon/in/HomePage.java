package com.amazon.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class HomePage extends DriverManager {

        public void searchForProduct() {
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java programming");
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        }








}
