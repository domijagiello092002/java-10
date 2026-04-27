package com.company;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Anna", 8);
        Employee tester = new Tester("Jan", 6);

        System.out.println(dev.getName() + ": " + dev.calculateSalary() + " PLN");
        System.out.println(tester.getName() + ": " + tester.calculateSalary() + " PLN");
    }
}
