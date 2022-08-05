package main.java.com.solvd.olympicgames;

abstract class Countries {
    // Abstract method (does not have a body)
    public abstract void nameOfCountry();

    public void name() {
        System.out.println("Olympics 2022");
    }
}

class Jamaica extends Countries {
    public void nameOfCountry() {
        // The body of animalSound() is provided here
        System.out.println("The Jamaicans");
    }
}

class Germany extends Countries {
    public void nameOfCountry() {
        // The body of animalSound() is provided here
        System.out.println("The Germans ");
    }
}


class Russia extends Countries {
    public void nameOfCountry() {
        // The body of animalSound() is provided here
        System.out.println("The Russians");
    }
}

class USA extends Countries {
    public void nameOfCountry() {
        // The body of animalSound() is provided here
        System.out.println("The Americans");
    }
}


class China extends Countries {
    public void nameOfCountry() {
        // The body of animalSound() is provided here
        System.out.println("The Chinese");
    }
}

class Places {
    public void main(String[] args) {
        Jamaica myJamaica = new Jamaica(); // Create a Pig object
        myJamaica.nameOfCountry();
        myJamaica.name();
        Germany myGermany = new Germany();
        myGermany.nameOfCountry();
        myGermany.name();
        Russia myRussia = new Russia();
        myRussia.nameOfCountry();
        myRussia.name();
        USA myUSA = new USA();
        myUSA.nameOfCountry();
        myUSA.name();
        China myChina = new China();
        myChina.nameOfCountry();
        myChina.name();
    }
}


