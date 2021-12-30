package com.company.games;

import java.util.Scanner;

public class GuessNumber {
    public void guessNumber(){
        System.out.println("I have randomly chosen a number from 1 - 100");
        System.out.println("Try to guess it");
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100) + 1;
        boolean hasWon = false;

        for (int i = 10; i >= 0; i--) {
            System.out.println("You have " + i + " guess(es) left");
            int guess = scanner.nextInt();
            if(randomNum < guess){
                System.out.println("It is smaller than " + guess);
            }
            else if(randomNum > guess){
                System.out.println("It is bigger than " + guess);
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Congratulations, you win!");
        }else {
            System.out.println("Game over, you lose!");
            System.out.println("The number was " + randomNum);
        }
    }
}

