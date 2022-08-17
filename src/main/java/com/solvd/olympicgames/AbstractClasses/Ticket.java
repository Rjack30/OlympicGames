package com.solvd.olympicgames.AbstractClasses;

public class Ticket {
    private final int number = 0;
    String name;
double ticketPrice;

    public Ticket(String name, int ticketPrice) {
        System.out.println("The  Price of ticket: 12 dollars ");
        this.name = name;
        this.ticketPrice = number;
    }

    public String toString() {
        return name + " " + ticketPrice;
    }

    public String getName() {
        return name;
    }
    public double getNumber() {
        return number;
    }
}





