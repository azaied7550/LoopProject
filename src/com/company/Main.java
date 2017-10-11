package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a Number..: ");
        int i =keyboard.nextInt();
        int sum=0;
        int counter=1;

        do {
            sum = sum + counter;
            counter++;
        }
        while (counter<=i);
        System.out.println("Sum of numbers from 0 to "+i + " =  "+sum);
	}
}
