package br.com.java.javacore.methodstest;

import br.com.java.javacore.methods.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(2, 2);
    }
}
