package main.java.com.solvd.olympicgames;
import java.util.ArrayList;

import static java.lang.String.*;

public class BaseballRoster {
    public static void main(String[] args) {
        ArrayList<Roster> roster = new ArrayList<Roster>();
        roster.add (new Roster("Bonds", "Barry", 24));
        roster.add (new Roster("Soto", "Juan", 12));
        roster.add(new Roster("Betts", "Mookie", 50));
        roster.add(new Roster("Jackson", "Roderick", 15));
        roster.add(new Roster("Jeter", "Dereck", 2));
        roster.add(new Roster("Griffey JR", "Ken", 24));
        roster.add(new Roster("Price", "David", 13));
        roster.add(new Roster("Kemp", "Matt", 45));
        roster.add(new Roster("Judge", "Aaron", 99));
        for (Roster i : roster) {
            System.out.println(i.toString());
        }
    }


    static class Roster extends BaseballRoster {
       @Override
        public String toString(){
           return fname + " " + lname + " " + number;
       }
        String lname;
        String fname;
        int number;

        public Roster() {

            lname = "";

            fname = "";

            number = 0;

        }

        public Roster(String lname, String fname, int number) {

            this.lname = lname;

            this.fname = fname;

            this.number = number;

        }

        public void setLastName(String lname) {

            this.lname = lname;

        }

        public String getLastName() {

            return lname;

        }

        public void setFirstName(String fname) {

            this.fname = fname;

        }

        public String getFirstName() {

            return fname;

        }

        public void setNumber(int number) {

            this.number = number;

        }

        public int getNumber() {

            return number;

        }

    }
}






























