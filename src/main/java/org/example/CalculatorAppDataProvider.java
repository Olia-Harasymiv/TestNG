package org.example;

import org.testng.annotations.DataProvider;

public interface CalculatorAppDataProvider {
    @DataProvider(name = "dataProviderSubtract")
    static Object[][] dataProviderSubtract(){
        return new Object[][]{{5,1, 4}, {12,7,5}, {8,1,7}};
    }

    @DataProvider(name = "dataProviderAdd")
    static Object[][] dataProviderAdd(){
        return new Object[][] {{3, 3 , 6}, {2, 2, 4}, {11, 4, 15}, {15, 4, 19}};
    }
    @DataProvider(name = "dataProviderMultiply")
    static Object[][] dataProviderMultiply(){
        return new Object[][]{{1,1,1}, {2,3,6}, {5,5,25}, {3,4,12}};
    }
    @DataProvider(name = "dataProviderDivide")
    static Object[][] dataProviderDivide(){
        return new Object[][]{{8,2,4}, {20, 5, 4}, {30, 6, 5}};
    }
}