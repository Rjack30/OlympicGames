package main.java.com.solvd.olympicgames.Classes;
import util.Scanner;
import main.java.com.solvd.olympicgames.Russia;

public abstract class Swimming {

    int Russia[];
    int  Jamaica[];
    main.java.com.solvd.olympicgames.Russia= new int[5];
    main.java.com.solvd.olympicgames.Jamaica= int[5];
    int counter1=0;
    int counter2=0;
    int k = 0;


        for (int i=0;i<=4;i++){
        Scanner scanint = new Scanner(System.in);
        System.out.println("Enter the number of points Russia earned in Match " + (i+1));
        Germany[i] = scanint.nextInt();
        System.out.println("Enter the number of points Germany earned in Match " + (i+1));
        China[i] = scanint.nextInt();

        if (Russia[i] < 1000 & Jamaica[i] > 1000){
            System.out.println("Then Jamaica has won!!!");
            System.out.println("Enter the number of points Russia earned in Match " + (i+1));
            Russia[i] = scanint.nextInt();
            System.out.println("Enter the number of points Jamaica earned in Match " + (i+1));
            Jamaica[i] = scanint.nextInt();
        }

        else  (Russia[i] >1000 & China[i] < 1000 {
            System.out.println(" Then Russia has won!!!");
            System.out.println("Enter the number of points Russia earned in Match " + (i+1));
            Germany[i] = scanint.nextInt();
            System.out.println("Enter the number of points Jamaica earned in Match " + (i+1));
            China[i] = scanint.nextInt();
        }

        if (Jamaica[i] < Russia[i]){
            counter1++;}
        else{ counter2++;}

    }
     if (counter1 > counter2)  {
        System.out.println("Russia has won the game.");}
      else{
        System.out.println("Jamaica has won the game.");
    }

    public abstract void spray();
}











}
