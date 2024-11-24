package com.maven.java;

import com.maven.java.runner.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectTests extends BaseTest {

    @Test
    public void testStoreName() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, "AskOmDch – Become a Selenium automation expert!", "Title does not match!");

    }
}


