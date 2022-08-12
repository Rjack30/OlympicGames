package main.java.com.solvd.olympicgames.Interfaces;


public interface Spike {



     class SlamBall implements Spike {
        public SlamBall() {
            // The body of animalSound() is provided here
            System.out.println("That ball was hit hard");
        }
        public void boom() {
            System.out.println("AAAAA");
        }

         public void slamBall() {
         }
     }

    class Main {
        public static void main(String[] args) {
            SlamBall mySlamBall = new SlamBall();
            mySlamBall.slamBall();
            mySlamBall.boom();
        }
    }






}
