import java.awt.desktop.SystemEventListener;
import java.lang.management.PlatformLoggingMXBean;
import java.util.*;

public class Assignment4A {
    public static void main(String[] args){
        int round = 1;
        int die1;
        int die2;
        int playerRoundScore;
        int comScore = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Let's play Bunco!");
            round = 1;
            do {
                die1 = r.nextInt(6) + 1;
                die2 = r.nextInt(6) + 1;

                playerRoundScore = (die1 + die2 +
                        ((die1 == round) ? 1 : 0) +
                        ((die2 == round) ? 1 : 0) +
                        ((die1 == round && die2 == round) ? 14 : 0) +
                        ((die1 == die2) ? 5 : 0));

                System.out.println(String.format("Round %d: You rolled %d and %d.", round, die1, die2));
                if(round != 6) {
                    System.out.print(String.format("Your score is %d. Do you want to stop?", playerRoundScore));
                    round += (1 + ((sc.next().equals("Y")) ? 6 : 0));
                }
                else{
                    System.out.println(String.format("Your score is %d. You’ve played all six rounds ", playerRoundScore));
                }
            }
            while (round <= 6);

            die1 = r.nextInt(6) + 1;
            die2 = r.nextInt(6) + 1;

            comScore = (die1 + die2 +
                    ((die1 == round) ? 1 : 0) +
                    ((die2 == round) ? 1 : 0) +
                    ((die1 == round && die2 == round) ? 14 : 0) +
                    ((die1 == die2) ? 5 : 0));

            System.out.println();
            System.out.println("Okay, the computer’s score is... "+comScore+"!");
            if(comScore > playerRoundScore){
                System.out.println("Sorry, you lose.");
            }
            if(comScore == playerRoundScore){
                System.out.println("You... uh, tied I guess? idk ");
            }
            if(comScore < playerRoundScore){
                System.out.println("You win!");
            }
            System.out.println();
            System.out.print("Do you want to play again?: ");
        }
        while(sc.next().equals("Y"));
        System.out.println("Game Over...");
    }
}
