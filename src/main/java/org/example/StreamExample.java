package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    private final List<Employee> employees = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        Employee employee = new Employee("Blubberdick", "Copperwire", 25, List.of("Java", "Python", "JavaScript"));
        Employee employee1 = new Employee("Biblical", "Concubine", 31, List.of("C#"));
        Employee employee2 = new Employee("Snorkeldink", "Curdlesnoot", 23, List.of("Java", "Haskell", "Scala"));
        Employee employee3 = new Employee("Syphilis", "Charizard", 42, List.of("PHP", "JavaScript", "React", "Angular"));
        Employee employee4 = new Employee("Bourgeoisie", "Colonize", 38, List.of("Java", "Scala"));
        Employee employee5 = new Employee("Botany", "Curdledmilk", 30, List.of("C", "C++"));
        Employee employee6 = new Employee("Burlington", "Battleship", 27, List.of("Rust", "Python"));
        Employee employee7 = new Employee("Bumblesniff", "Charizard", 51, List.of("Java", "Spring", "Hibernate", "Java"));

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
    }

    @Test
    public void firstStream() {
        employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);
    }

}

