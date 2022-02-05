package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        System.out.println(hour * 3600 + min * 60 + sec);
    }
}
