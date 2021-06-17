package br.com.java.arrays;

public class Arrays4 {
    public static void main(String[] args) {
//        int[][] days = new int[3][];
//        days[0] = new int[2];
//        days[1] = new int[]{1, 2, 3};
//        days[2] = new int[4];

        int[][] days = {{0,0},{1,2,3},{0,0,0,0}};

        for (int[] arr : days) {
            System.out.println("array:" + arr);
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
