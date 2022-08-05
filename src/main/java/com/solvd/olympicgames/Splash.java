package main.java.com.solvd.olympicgames;



interface Splash {
    public void WaterSound();
    public void loud();
}

//WaterSound implements Splash
class Water implements Splash {
    public void WaterSound() {
        // The body of animalSound() is provided here
        System.out.println("She just dove into the water");
    }

    @Override
    public void loud() {

    }

    public void silent() {
        // The body of sleep() is provided here
        System.out.println("ZZZZ");
    }
}

class main {
    public static void main(String[] args) {
        Water myWater= new Water();
        myWater.WaterSound();
        myWater.loud();
    }
}

