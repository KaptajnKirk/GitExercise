package com.company;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public void greet () {

        System.out.println("Please input your name: ");
        String name = sc.next();

        System.out.println("Hey  " + name);
        System.out.println("Hey again" + name);
        System.out.println("Hey again again" +name);

    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.greet();

        System.out.println("It works!");

    }

}
