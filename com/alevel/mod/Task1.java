package com.alevel.mod;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {45,68,7,45,12,78,36,97,45,15,68};

        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count+1;


    }
}
