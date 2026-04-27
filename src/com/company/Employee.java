package com.company;

public abstract class Employee implements Payable {
    protected String name;
    protected int skill;

    public Employee(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }
}
