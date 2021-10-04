package com.company;

import com.company.WorkerClasses.EngineerWorker;
import com.company.WorkerClasses.SalesmanWorker;

public class Main {

    public static void main(String[] args) {

        EngineerWorker worker1 = new EngineerWorker("Ivan", "JavaDev", 50, 30000, "Volleyball");
        SalesmanWorker worker2 = new SalesmanWorker("Pavel", "Salesman", 30, 25000);

        System.out.println(worker1.getSalary());
        System.out.println(worker2.getSalary());
        worker1.fixSomething();
        worker2.sellSomething();

        System.out.println(worker1.giveBonus());
        System.out.println(worker2.giveBonus());




    }

}
