package com.system27.kafkaConsumer.Model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1234567L;

    private String name;

    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
bhadresh3

System27
 */