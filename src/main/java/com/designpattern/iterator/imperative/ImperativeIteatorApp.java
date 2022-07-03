package com.designpattern.iterator.imperative;

/**
 * The Iterator design pattern, enables to get a way yo access the elements of a
 * collection object in sequential manner without any need to know its internal representation.
 */
public class ImperativeIteatorApp {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1,"Akash");
        employees[1] = new Employee(2,"Ajeesh");
        employees[2] = new Employee(3,"Arjun");
        employees[3] = new Employee(4,"Vikram");
        employees[4] = new Employee(5,"Vikram");

        CustomList<Employee> employeeCustomList = new EmployeeList(employees);
        CustomIterator<Employee> employeeIterator = employeeCustomList.customIterator();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }


    }
}
