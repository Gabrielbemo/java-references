package br.com.java.javacore.methods;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(5 + 5);
    }

    public void subtractTwoNumbers() {
        System.out.println(5 - 5);
    }

    public void multiplyTwoNumbers(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public double splitTwoNumber(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        return 0;
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
