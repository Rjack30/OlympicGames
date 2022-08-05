package main.java.com.solvd.olympicgames;

interface HomeRun {
    public void batSound();
    public void loud();
}

//BatSound implements HomeRun
class BatSound implements HomeRun {
    public void batSound() {
        // The body of animalSound() is provided here
        System.out.println("The bat says: crack");
    }
    public void loud() {
        // The body of sleep() is provided here
        System.out.println("AAAAAA");
    }
}

class Main {
    public static void main(String[] args) {
        BatSound myBatSound = new BatSound();
        myBatSound.batSound();
        myBatSound.loud();
    }
}