package com.company.WorkerClasses;

import com.company.ExtraUtils.Promotion;

public class EngineerWorker extends Worker implements Promotion {

    private int finishedFixed;

    public EngineerWorker(String name, String position, int age, int salary) {
        super(name, position, age, salary);
        finishedFixed = 0;
    }

    public EngineerWorker(String name, String position, int age, int salary, String interest) {
        super(name, position, age, salary, interest);
        finishedFixed = 0;
    }
    public void fixSomething(){
        System.out.println("Fixed something");
    }

    @Override
    public double giveBonus() {
        return getSalary() * 2;

    }

    @Override
    public void giveNextPosition() {

    }

    @Override
    public void giveLowerPosition() {

    }
}
