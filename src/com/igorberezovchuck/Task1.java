package com.igorberezovchuck;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeightGram(152);
        lemon.setPricePerKg(41.90);
        System.out.println("Lemon price: " + lemon.getPrice());

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 176, 27.00);
        System.out.println("Banana price: " + banana.getPrice());

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 274, 14.90);
        System.out.println("Red Apple price: " + redApple.getPrice());

        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 158, 15.90);
        System.out.println("Green Apple price: " + greenApple.getPrice());

        Fruit[] fruits = new Fruit[4];
        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = greenApple;
        System.out.println(Arrays.toString(fruits));

        double total = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == null) {
                continue;
            }
            total += fruits[i].getPrice();
        }
        System.out.println("Total price: " + total);
    }
}
