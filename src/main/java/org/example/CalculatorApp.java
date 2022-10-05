package org.example;

public class CalculatorApp {

    public CalculatorApp() {
    }

    public static float add(int number1, int number2){
        return number1+number2;
    }
    public static float subtract(int number1, int number2){
        return number1 - number2;
    }
    public static float multiply(int number1, int number2){
        return number1*number2;
    }
    public static float divide(int number1, int number2){
        if (number2==0){
            return 0;}
        else{
            return (float)number1/number2;}
    }
}
