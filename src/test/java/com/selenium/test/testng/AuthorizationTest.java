package com.selenium.test.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuthorizationTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();

        driver.get("http://localhost:8080/secure/Dashboard.jspa");
    }

    @Test // Marking this method as part of the test
    public void gotoAuthorizationJira() {

        driver.get("http://localhost:8080/secure/Dashboard.jspa");

        driver.findElement(By.id("login-form-username")).sendKeys("alyona");
        driver.findElement(By.id("login-form-password")).sendKeys("7753191");

        driver.findElement(By.id("login")).click();



    }

    @AfterClass // Runs this method after all the test methods in the current class have been run
    public void tearDown() {

//        driver.quit();
    }
}
