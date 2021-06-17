package br.com.java.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[][] days = new int[2][2];
        days[0][0] = 30;
        days[0][1] = 31;
        days[1][0] = 29;
        days[1][1] = 28;

        for (int index = 0; index<days.length; index++){
            System.out.println("endereço de memória: " + days[index]);
            for (int index2 = 0; index2<days.length; index2++){
                System.out.println(days[index][index2]);
            }
        }

        System.out.println("-------------------------------");

        //foreach
        for (int[] ref : days) {
            for (int dia: ref){
                System.out.println("Day: " + dia);
            }
        }

    }
}
