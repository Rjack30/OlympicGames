package main.java.com.solvd.olympicgames.Classes;

public class TakeShot {
            public static void main(String[] args) {
                int target = 10;

                BasketballGame shot1 = new BasketballGame();
                BasketballGame shot2 = new BasketballGame();

                int player1Score = 0;
                int player2Score = 0;

                double player1Shot;
                double player2shot;

                while (player1Score <= target && player2Score <= target) {
                    player1Shot = shot1.shot();
                    player2shot = shot2.shot();
                    if (player1Shot > 50) {
                        player1Shot++;
                    }
                    if (player2shot > 50) {
                        player2shot++;
                    }
                }
                if (player1Score > player2Score) {
                    System.out.println("Player 1 wins ");
                } else if (player2Score > player1Score) System.out.println("Player 2 wins ");
            }
        }



