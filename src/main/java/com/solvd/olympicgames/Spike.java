package main.java.com.solvd.olympicgames;


interface Spike {
    public void slamBall();
    public void loud();
}

//WaterSound implements Splash
abstract class SlamBall implements Spike {
    public void SlamBall() {
        // The body of animalSound() is provided here
        System.out.println("That ball was hit hard");
    }
    public void loud() {
        System.out.println("AAAAA");
    }
}

class Main {
    public static void main(String[] args) {
        SlamBall mySlamBall = new SlamBall();
        mySlamBall.SlamBall();
        mySlamBall.loud();
    }
}


