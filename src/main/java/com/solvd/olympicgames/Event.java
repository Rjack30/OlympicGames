package main.java.com.solvd.olympicgames;
import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;

public class Event {
    public static void main(String[] args) {
        System.out.println("OlympicGames");
    }


    class main {
        public void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter name of Event you would like to see, and which day :");

            String name = myObj.nextLine();
            int day = myObj.nextInt();
            LocalDate myObj = LocalDate.now();  // Create a date object
            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Day: " + day);
            System.out.println(myObj);
        }
    }
}











