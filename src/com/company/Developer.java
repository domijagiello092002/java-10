package com.company;

public class Developer extends Employee {

    public Developer(String name, int skill) {
        super(name, skill);
    }

    @Override
    public double calculateSalary() {
        return skill * 2000.0;
    }
}
