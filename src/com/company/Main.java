package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private static String player;
    private static int[] gameBoard = new int[10];

    public static void main(String[] args) {
        playerName();

    }

    public static int computersScore() {
        Random random = new Random();
        int computersChoice = random.nextInt(10);
        return computersChoice;
    }

    public static void playerName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the players name");
        player = input.next();
    }

    public static int playerNumber() {
        Scanner input = new Scanner(System.in);
        boolean whileloop = true;
        while (whileloop) {
            System.out.println(player + "Please enter your random number");
            int playerGuess = input.nextInt() - 1;
            if (playerGuess < 0) {
                System.out.println("This number is out of bounds");
whileloop = true;
            }


            return playerGuess;
        }
        public static int score () {

        }
    }
