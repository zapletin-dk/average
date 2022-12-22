package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter =0;
        int digit  = scanner.nextInt();
        while (digit != 0){
            sum += digit;
            digit = scanner.nextInt();
            counter++;
        }
        System.out.println(sum/counter);
    }

}