package Services;

import Entity.Person;

public class Game {
    public String nameOfGame;
    public int yearReleased;
    public Person owner;

    public Game(String nameOfGame, int yearReleased, Person owner) {
        this.nameOfGame = nameOfGame;
        this.yearReleased = yearReleased;
        this.owner = owner;
    }

    public String toString()
    {
        return "[" + nameOfGame + "(" + yearReleased + ")" + ", owned by " + owner.toString() + "]";
    }
}

