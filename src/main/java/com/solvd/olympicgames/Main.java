package main.java.com.solvd.olympicgames;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Calendar calendar = new Event[month 8, day 2, year 2022];
        SportEvent sportEvent = new sportEvent();




        System.out.println("Welcome to the 2022 OlympicGames");
        System.out.println("What Event would you like to see today");
        int days = keyboard.nextInt();

        System.out.println("For a " + day + "what sport event would you like to see");
        System.out.println("[1] Baseball");
        System.out.println("[2] Basketball");
        System.out.println("[3] Swimming");
        System.out.println("[4] Volleyball");
        int value = keyboard.nextInt();

        if (value==1){
            System.out.println("Here is a list of the Events going on today ")
            System.out.println(Arrays.toString(sportEvent.Baseball));
            System.out.println("Which Event would you like");
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


}



