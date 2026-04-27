package com.company;

public class Tester extends Employee {

    public Tester(String name, int skill) {
        super(name, skill);
    }

    @Override
    public double calculateSalary() {
        return skill * 1500.0;
    }
}
