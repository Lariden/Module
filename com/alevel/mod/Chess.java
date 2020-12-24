package com.alevel.mod;

public class Chess {
    public static void main(String[] args) {
        int m = 8;
        int n = 8;
        int[][] twoDimArray = new int[m][n];
        boolean isOneVal = true;
        for (int[] rowArr : twoDimArray) {
            for (int i = 0; i < rowArr.length; i++) {
                if (isOneVal) rowArr[i] = 1;
                else rowArr[i] = 0;
                System.out.printf("%2d", rowArr[i]);
                isOneVal = !isOneVal;
            }
            System.out.println();
        }
    }
}
