package com.selenium.test.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateTask {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/secure/Dashboard.jspa");
    }

    @Test // Marking this method as part of the test
    public void gotoAuthorizationJiraCreateTask() {

        driver.get("http://localhost:8080/secure/Dashboard.jspa");

        driver.findElement(By.id("login-form-username")).sendKeys("alyona");
        driver.findElement(By.id("login-form-password")).sendKeys("7753191");

        driver.findElement(By.id("login")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("create_link")).click();
        driver.findElement(By.id("project-field")).sendKeys("Tratoties (TRAT101)");
        driver.findElement(By.id("issuetype-field")).clear();
        driver.findElement(By.id("issuetype-field")).sendKeys("Задача");


        driver.findElement(By.id("summary")).sendKeys("Создать форму регистрации");
        driver.findElement(By.id("reporter-field")).clear();
        driver.findElement(By.id("reporter-field")).sendKeys("alyona.piy@gmail.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("fixVersions-textarea")).sendKeys("Version 2.0");
        driver.findElement(By.id("priority-field")).sendKeys("Medium");
        driver.findElement(By.id("labels-textarea")).sendKeys("Task");

       // driver.findElement(By.id("issuelinks-linktype")).clear();
       // driver.findElement(By.id("issuelinks-linktype")).sendKeys("clones");
        driver.findElement(By.id("issuelinks-issues-textarea")).sendKeys("TRAT101-24");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("create-issue-submit")).click();

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    @AfterClass // Runs this method after all the test methods in the current class have been run
    public void tearDown() {

      //  driver.quit();
    }
}
