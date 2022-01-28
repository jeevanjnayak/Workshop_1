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

        System.out.println("Enter Either 'X' or 'O' :  ");
        Scanner sc = new Scanner(System.in);
        char Choice = sc.next().charAt(0);
        if (Choice == 'X')
            System.out.println("You choose 'X' and Computer chooses 'O' ");
        else if (Choice == 'O')
            System.out.println("You choose 'O' and Computer chooses 'X' ");
        else
            System.out.println("Invalid choice");
        return null;
    }
    public static void main(String[] args) {

        String StartArray = start();
        String Choice = Choose();
        System.out.println(Choice);



    }
}