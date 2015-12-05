package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int w;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj wysokosci choinki");
        w = odczyt.nextInt();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i * 2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

