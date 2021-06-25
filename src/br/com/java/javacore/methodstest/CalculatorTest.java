package br.com.java.javacore.methodstest;

import br.com.java.javacore.methods.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(2, 2);
        System.out.println(calculator.splitTwoNumber(10, 0));

        int[] numbers = {1,2,3,4,5};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(1,2,3,4,5);
    }
}
