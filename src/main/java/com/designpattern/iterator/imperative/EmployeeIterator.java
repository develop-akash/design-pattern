package com.designpattern.iterator.imperative;

public class EmployeeIterator implements CustomIterator<Employee> {

    private Employee[] employees;
    private int position;

    public EmployeeIterator(Employee[] employees) {
        this.employees = employees;
        this.position = 0;
    }

    @Override
    public Employee next() {
        return employees[position++];
    }

    @Override
    public Employee currentElement() {
        return employees[position];
    }

    @Override
    public boolean hasNext() {
        return !(position >= employees.length);
    }
}
