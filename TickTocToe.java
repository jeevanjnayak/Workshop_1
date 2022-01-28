package com.Bridgelabz;

import java.util.Scanner;

public class TickTocToe {

    public static String start()
    {
        char[] Arr = new char[10];
        for (int i = 1; i < 10; i++) {
            Arr[i] = ' ';
        }
        return null;
    }
    static String Choose() {
        char ComputerChoice = 0;
        System.out.println("Enter Either 'X' or 'O' :  ");

        Scanner sc = new Scanner(System.in);
        char Choice = sc.next().charAt(0);

        if (Choice == 'X') {
            ComputerChoice = 'O';
        }

        else if (Choice == 'O') {
            ComputerChoice = 'X';
        }

        else
            System.out.println("Invalid choice");

        System.out.println("You choose '" +Choice+ "' and Computer chooses '" +ComputerChoice+ "' ");
        
        return null;
    }
    public static void main(String[] args) {

        char ComputerChoice;
        String StartArray = start();
        String Choice = Choose();
        System.out.println(Choice);



    }
}