package com.designpattern.iterator.imperative;

public class EmployeeList implements CustomList<Employee> {

    private Employee[] employees;
    public EmployeeList(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public CustomIterator<Employee> customIterator() {
        return new EmployeeIterator(employees);
    }
}
