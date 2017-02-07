package com.selenium.test.testng;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alenka on 08.02.2017.
 */
public class SearchIssues {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/secure/Dashboard.jspa");
    }

    @Test // Marking this method as part of the test
    public void gotoSearchTssues() {

        driver.get("http://localhost:8080/secure/Dashboard.jspa");

        driver.findElement(By.id("login-form-username")).sendKeys("alyona");
        driver.findElement(By.id("login-form-password")).sendKeys("7753191");
        driver.findElement(By.id("login")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("find_link")).click();
        driver.findElement(By.id("issue_lnk_10102_lnk")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("action_id_21")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("priority-field")).click();
        driver.findElement(By.id("priority-field")).sendKeys("Low");
//#

    }

    @AfterClass
    public void tearDown() {

        // driver.quit();
    }
}