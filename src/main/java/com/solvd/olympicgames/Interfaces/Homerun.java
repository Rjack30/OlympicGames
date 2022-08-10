package main.java.com.solvd.olympicgames.Interfaces;

public interface Homerun {

    interface HomeRun {

    }

    //BatSound implements HomeRun
    class BatSound implements HomeRun {
        private void batSound() {
            System.out.println("The bat says: crack");
        }
        public void crack() {
            // The body of sleep() is provided here
            System.out.println("AAAAAA");
        }
    }

    class Main {
        public static void main(String[] args) {
            BatSound myBatSound = new BatSound();
            myBatSound.batSound();
            myBatSound.crack();
        }
    }



}
