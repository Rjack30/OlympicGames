package main.java.com.solvd.olympicgames.Interfaces;



public interface Water {



    //Splash implements Water
    class Splash implements Water {
        public Splash() {
            // The body of animalSound() is provided here
            System.out.println("She just dove into the water");
        }


        public void splash() {
        }
    }

    class Main {
        public static void main(String[] args) {
            Splash.Splash mySplash = new Splash.Splash();
            mySplash.splash();
            mySplash.splash();
        }
    }






}

