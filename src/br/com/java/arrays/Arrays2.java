package br.com.java.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{1,2,3,4,5};

        for (int iterator = 0; iterator < numbers2.length; iterator++){
            System.out.println(numbers2[iterator]);
        }

        for(int number : numbers2){
            System.out.println(number);
        }
    }
}
