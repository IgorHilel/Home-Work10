package com.igorberezovchuck;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] brick = {1, 2, 6};
        int[] hole = {1, 2};
        isPass(brick, hole);
    }

    private static void isPass(int[] brick, int[] hole) {
        Arrays.sort(brick);
        Arrays.sort(hole);
        if (brick[0] <= hole[0] && brick[1] <= hole[1]){
            System.out.println("Кирпич проходит в отверстие");
        } else {
            System.out.println("Кирпич не проходит в отверстие");
        }
    }
}
