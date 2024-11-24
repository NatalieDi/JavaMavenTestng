package com.maven.java;

import com.maven.java.runner.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest extends BaseTest {
    @Test
    public void testShoppingCartIconValidationTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        driver.findElement(By.xpath("//a[@class='wp-block-button__link']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'?add-to-cart=1205')]")).click();

        WebElement cartIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']//span[@class='count'][normalize-space()='1']")));
        cartIcon.click();

        String text = driver.findElement(By.xpath("//a[normalize-space()='Basic Blue Jeans']")).getText();
        Assert.assertEquals(text, "Basic Blue Jeans");
    }
}

