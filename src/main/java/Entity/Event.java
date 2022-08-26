package Entity;
import java.util.Scanner;



    class OlympicEvents {
        public static void main(String[] args) {
            System.out.println("OlympicGames");
        }


         static class Main {
            public void main(String[] args) {
                Scanner myObj = new Scanner(System.in);

                System.out.println("What Game would like to play, and which day");

                String name = myObj.nextLine();
                int day = myObj.nextInt();
                // Output input by user
                System.out.println("Name: " + name);
                System.out.println("Day: " + day);
                System.out.println(myObj);
            }
        }
    }










