package com.designpattern.iterator.declarative;

import com.designpattern.iterator.imperative.Employee;

public class DeclarativeIteratorDemo {
    public static void main(String[] args) {
        DeclarativeEmployeeList declarativeEmployeeList = new DeclarativeEmployeeList(new Employee[] {
                new Employee(1,"Akash"),
        new Employee(2,"Ajeesh"),
        new Employee(3,"Arjun"),
        new Employee(4,"Vikram"),
        new Employee(5,"Vikram"),
        });
        declarativeEmployeeList.forEach(System.out::println);
    }
}
