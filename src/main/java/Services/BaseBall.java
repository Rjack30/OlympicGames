package Services;

import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {
        System.out.println("Do you want to watch baseball game? (Y/N)");
        Scanner userinput = new Scanner(System.in);
        String answer = userinput.nextLine();
        boolean play = false;
        switch (answer) {
            case "y":
                System.out.println("Yes!");
                play = true;
                break;
            case "n":
                System.out.println("No!");
                break;
            default:
                System.out.println("Never mind");
                break;
        }
        // if play is true
        if(play) {
            System.out.println("How many days? (1,2,3,4");
            Scanner dayinput = new Scanner(System.in);
            int day = dayinput.nextInt();

            if(day == 1) {
                System.out.println("Do you want to watch: "+day+" day! ");
            } else if (day == 2) {
                System.out.println("Do you want to watch: "+day+" day! ");
            } else if (day == 3) {
                System.out.println("Do you want to watch: "+day+" day! ");
            } else if (day == 4) {
                System.out.println("Do you want to watch: "+day+" day! ");
            }
        }else{
            System.out.println("Bye have a nice day");
        }
    }
}





