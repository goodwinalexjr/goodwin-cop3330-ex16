package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        String message = age > 15 ? "You are old enough to legally drive" : "You are not old enough to legally drive";
        System.out.println(message);
    }
}
