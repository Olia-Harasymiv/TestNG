package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorAppTest {
    private CalculatorApp calculatorApp = new CalculatorApp();

    @BeforeTest
    public void init() {
        calculatorApp = new CalculatorApp();
    }

    @Test(groups = "test")
    public void TestAdd1() throws InterruptedException {
        int first = 2, second = 3;
        int expectedResult = first + second;
        int actualResult = (int) calculatorApp.add(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestAdd2() throws InterruptedException {
        int first = 10, second = 20;
        int expectedResult = first + second;
        int actualResult = (int) calculatorApp.add(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "test")
    public void TestSubtract1() throws InterruptedException {
        int first = 50, second = 30;
        int expectedResult = first - second;
        float actualResult = calculatorApp.subtract(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract2() throws InterruptedException {
        int first = 1000, second = 100;
        int expectedResult = first - second;
        float actualResult = calculatorApp.subtract(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "test")
    public void TestMultiply1() throws InterruptedException {
        int first = 7, second =2;
        int expectedResult = first * second;
        int actualResult = (int) calculatorApp.multiply(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply2() throws InterruptedException {
        int first = 9, second = 2;
        int expectedResult = first * second;
        int actualResult = (int) calculatorApp.multiply(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "test")
    public void TestDivide1() throws InterruptedException {
        int first = 2000, second = 200;
        int expectedResult = first / second;
        int actualResult = (int) calculatorApp.divide(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide2() throws InterruptedException {
        int first = 4, second = 2;
        int expectedResult = first / second;
        int actualResult = (int) calculatorApp.divide(first, second);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }
}