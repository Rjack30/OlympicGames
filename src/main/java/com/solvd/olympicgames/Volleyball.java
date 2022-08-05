package main.java.com.solvd.olympicgames;

public class Volleyball {
    int Germany[];
    int  China[];
    Germany=new int[5];
    China= int[5];
    int counter1=0;
    int counter2=0;
    int k = 0;


        for (int i=0;i<=4;i++){
        Scanner scanint = new Scanner(System.in);
        System.out.println("Enter the number of points Germany earned in Match " + (i+1));
        Germany[i] = scanint.nextInt();
        System.out.println("Enter the number of points China earned in Match " + (i+1));
        China[i] = scanint.nextInt();

        if (Germany[i] < 25 & China[i] > 25){
            System.out.println("Then China has won!!!");
            System.out.println("Enter the number of points Germany earned in Match " + (i+1));
            Germany[i] = scanint.nextInt();
            System.out.println("Enter the number of points China earned in Match " + (i+1));
            China[i] = scanint.nextInt();
        }

        else  (Germany[i] >25 & China[i] < 25 {
            System.out.println(" Then Germany has won!!!");
            System.out.println("Enter the number of points Germany earned in Match " + (i+1));
            Germany[i] = scanint.nextInt();
            System.out.println("Enter the number of points China earned in Match " + (i+1));
            China[i] = scanint.nextInt();
        }

        if (China[i] < Germany[i]){
            counter1++;}
        else{ counter2++;}

    }
     if (counter1 > counter2)  {
        System.out.println("Germany has won the game.");}
      else{
        System.out.println("China has won the game.");
    }
    }
