package main.java.com.solvd.olympicgames.Classes;

public class Car {
    public String model;
    public int yearReleased;
    public Person owner;

    public Car(String model, int yearReleased, Person owner) {
        this.model = model;
        this.yearReleased = yearReleased;
        this.owner = owner;
    }

    public String toString()
    {
        return "[" + model + "(" + yearReleased + ")" + ", owned by " + owner.toString() + "]";
    }
}
