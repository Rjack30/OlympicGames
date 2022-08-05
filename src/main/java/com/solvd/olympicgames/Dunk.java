package main.java.com.solvd.olympicgames;


interface Dunk {
    public void rimSound();
    public void loud();
}

//RimSound implements HomeRun
 class Rim implements Dunk {
    public void RimSound() {
        // The body of animalSound() is provided here
        System.out.println("The rim is bending!!!!!");
    }

    @Override
    public void rimSound() {

    }

    public void loud() {
        // The body of sleep() is provided here
        System.out.println("You Just Got Dunk On!!!");
    }
}

 class Main {
    public static void main(String[] args) {
        Rim myRim = new Rim();
        myRim.rimSound();
        myRim.loud();
    }
}



