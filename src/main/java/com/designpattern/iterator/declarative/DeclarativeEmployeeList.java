package com.designpattern.iterator.declarative;

import com.designpattern.iterator.imperative.Employee;

import java.util.function.Consumer;

public class DeclarativeEmployeeList {
    Employee[] employees;

    public DeclarativeEmployeeList(Employee[] employees) {
        this.employees = employees;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < employees.length; i++) {
            consumer.accept(employees[i]);
        }
    }
}
