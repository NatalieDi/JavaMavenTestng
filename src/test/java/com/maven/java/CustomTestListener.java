package com.maven.java;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Handle test failure
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Handle test skipped
    }

    @Override
    public void onStart(ITestContext context) {
        // Handle start
    }

    @Override
    public void onFinish(ITestContext context) {
        // Handle finish
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Handle test start
    }
}

