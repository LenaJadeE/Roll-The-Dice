package com.pluralsight;

public class RollTheDiceApplication {
    public static void main(String[] args){
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll" + i + ":" + roll1 + "-" + roll2 + "  Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println();
        System.out.println("Times 2 was rolled: " + twoCounter);
        System.out.println("Times 4 was rolled: " + fourCounter);
        System.out.println("Times 6 was rolled: " + sixCounter);
        System.out.println("Times 7 was rolled: " + sevenCounter);
    }
}