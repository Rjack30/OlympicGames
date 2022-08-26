package com.solvd.olympicgames.AbstractClasses;

 public abstract class Customer {
     private final int number;
     String name;
    int numberOfTickets;


     public Customer(String name, int number) {
         System.out.println("The  Customer");
         this.name = name;
         this.numberOfTickets = number;
         this.number = 0;
     }

     public Customer(int number) {

         this.number = number;
     }


     public String toString() {
         return name + " " + number;
     }

     public String getName() {
         return name;
     }
     public int getNumber() {
         return number;
     }
 }
    


