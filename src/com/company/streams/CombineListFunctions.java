package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineListFunctions {

    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }  
    }
    public static void main(String[] args) {
        Employee[] employeesArr = {
            new Employee("John", 34, "developer", 80000f),
            new Employee("Hannah", 24, "developer", 95000f),
            new Employee("Bart", 50, "sales executive", 100000f),
            new Employee("Sophie", 49, "construction worker", 40000f),
            new Employee("Darren", 38, "writer", 50000f),
            new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
    
        Float totalDevelopersSalaries = employees.stream()
            .filter(emp -> emp.jobTitle.equals("developer"))
            .map(dev -> dev.salary)
            .reduce(0f, (acc, x) -> acc + x);

        long numberOfDevelopers = employees.stream()
            .filter(emp -> emp.jobTitle.equals("developer"))
            .count();
    
        Float averageDeveloperSalary = totalDevelopersSalaries / numberOfDevelopers;
        System.out.println("Total developers salary: " + totalDevelopersSalaries);
        System.out.println("Number of developers: " + numberOfDevelopers);
        System.out.println("Average developer salary: " + averageDeveloperSalary);
    }
    
    
}