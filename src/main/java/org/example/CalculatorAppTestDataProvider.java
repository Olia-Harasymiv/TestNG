package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorAppTestDataProvider implements CalculatorAppDataProvider {
    private CalculatorApp calculatorApp;

    @BeforeTest
    public void init() {
        calculatorApp = new CalculatorApp();
    }

    @Test(dataProvider = "dataProviderAdd")
    void addTest(int first, int second, int result){
        Assert.assertEquals(calculatorApp.add(first, second), result);
    }
    @Test(dataProvider = "dataProviderSubtract")
    void subTest(int first, int second, int result){
        Assert.assertEquals(calculatorApp.subtract(first, second), result);
    }
    @Test(dataProvider = "dataProviderMultiply")
    void mulTest(int first, int second, int result){
        Assert.assertEquals(calculatorApp.multiply(first, second), result);
    }
    @Test(dataProvider = "dataProviderDivide")
    void divTest(int first, int second, int result){
        Assert.assertEquals(calculatorApp.divide(first, second), result);
    }
}
