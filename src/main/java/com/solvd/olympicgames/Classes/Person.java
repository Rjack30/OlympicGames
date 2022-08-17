package com.solvd.olympicgames.Classes;
 public class Person {
    public String name;
    public String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return "[" + name + " " + lastName + "]";
    }
}

