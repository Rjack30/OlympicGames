package main.java.com.solvd.olympicgames.Interfaces;



public interface Dunk {


    interface Dunks {

    }

    class Rim implements Dunk {
         void RimSound() {
            System.out.println("The rim is bending!!!!!");
        }

        private void rimSound() {

        }

        public void loud() {
            // The body of sleep() is provided here
            System.out.println("You Just Got Dunked On!!!");
        }
    }

    class Main {
        public static void main(String[] args) {
            Rim myRim = new Rim();
            myRim.rimSound();
            myRim.loud();
        }
    }





}
