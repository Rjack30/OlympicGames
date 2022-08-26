package Services;


import java.util.Arrays;
import java.util.Scanner;

import Entity.Person;
import Entity.SportEvent;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.time.LocalDateTime;
public class Main {

    private static final Logger logger = LogManager.getLogger(Cities.class);
    public static void main(String[] args) {

        var person1 = new Person("Jonh", "Gold");
        var person2 = new Person("James", "Miller");
        // create 2 cars
        var game1 = new Game("Baseball Ballers", 2020, person1);
        var game2 = new Game("NBA 2k 2021", 2020, person2);
        // logging
        logger.debug("Some debug log");
        logger.info("Person1: " + person1);
        logger.info("Game2: " + game2);
        logger.warn("Warning accrued at " + LocalDateTime.now());
        logger.error("Error accrued at " + LocalDateTime.now());
        logger.fatal("Serious problem with car " + game1 + " accrued at " + LocalDateTime.now());

        Scanner keyboard = new Scanner(System.in);

        int day = 0;
        SportEvent sportEvent = new SportEvent();




        System.out.println("Welcome to the 2022 OlympicGames");
        System.out.println("What Event would you like to see today");


        System.out.println("For a " + day + "what sport event would you like to see");
        System.out.println("[1] Baseball");
        System.out.println("[2] Basketball");
        System.out.println("[3] Swimming");
        System.out.println("[4] Volleyball");
        int value = keyboard.nextInt();

        if (value==1){
            System.out.println("Here is a list of the Events going on today ");
            for (String s : Arrays.asList(Arrays.toString(sportEvent.Baseball), "Which Event would you like")) {
                System.out.println(s);
            }
        }
        int sportChoice = keyboard.nextInt();
        switch (sportChoice){
            case 1:
            System.out.println("Baseball Game");
           break;
            case 2:
                System.out.println("Basketball Game");
                break;
            case 3:
                System.out.println("Swimming Race");
                break;
            case 4:
                System.out.println("Volleyball Game");
                break;


        }















    }


    private static class Cities {
    }
}



