package manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
    Logger logger= LoggerFactory.getLogger(TestNGListener.class);
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        logger.info("TestNG listener Start: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        logger.info("TestNG listener Success: " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        logger.info("TestNG listener Failure: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        logger.info("TestNG listener Skipped: " + result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        logger.info("TestNG listener Percentage: " + result.getName());

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
       // logger.info("TestNG listener WithTimeout: " + result.getParameters());

    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
       // logger.info("TestNG listener: " + context.getName());

    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        logger.info("TestNG listener: " + context.getName());

    }
}
