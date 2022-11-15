package com.company.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chellenge1 {

    static class Person {
        public final String name;
        public final Integer age;
        
        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;
       
        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }        
    }

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
        Person[] peopleArr = {
            new Person("Brandon", 23),
            new Person("Hank", 43),
            new Person("Jenna", 33 ),
            new Person("Veronica", 56),
            new Person("Jack", 27)
        };

        List<Person> peoples = new ArrayList<>(Arrays.asList(peopleArr));
        //Get the list that only contains all the people's names
        Function<Person, String> getName = p -> p.name;
        List<String> namesList = peoples.stream().map(getName::apply).collect(Collectors.toList());
        System.out.println("Names: " + namesList);

        Car[] carsArr = {
            new Car("Chevy", "red", 45000f),
            new Car("Ford", "blue", 23000f),
            new Car("Toyota", "grey", 14000f),
            new Car("Lamborghini", "blue", 150000f),
            new Car("Renault", "blue", 150000f)
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));
        //Get list of all the blue cars
        Function<String, Predicate<Car>> getBlueCars = color -> car -> car.color.equals(color);
        Predicate<Car> carsFilter = getBlueCars.apply("blue"); 

        List<Car> filteredCarsByColor = cars.stream().filter(carsFilter).collect(Collectors.toList());
        System.out.println("Cars: " + filteredCarsByColor);


        Employee[] employeesArr = {
            new Employee("John", 34, "developer", 80000f),
            new Employee("Hannah", 24, "developer", 95000f),
            new Employee("Bart", 50, "sales executive", 100000f),
            new Employee("Sophie", 49, "construction worker", 40000f),
            new Employee("Darren", 38, "writer", 50000f),
            new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
        
        // Find the sum of all of employee salaries
        Function<Employee, Float> getSalry = e -> e.salary;
        BinaryOperator<Float> accumulator = (acc, x) -> acc + x;        
        Float salariesSum = employees.stream().map(getSalry::apply).reduce(0f, accumulator);
        System.out.println("Sum: " + salariesSum);
        
    }
}
