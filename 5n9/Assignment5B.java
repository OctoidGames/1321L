import java.util.*;

public class Assignment5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean done;

        System.out.print("How many games do you want to play?: ");
        int games = sc.nextInt();

        int round = 1;
        int[] memory = new int[games];

        do{
            String thrown;
            do { // I got annoyed while testing because I can't spell
                System.out.print("What do you want to throw?: ");
                thrown = sc.next();
                if(!(thrown.equals("Rock")||thrown.equals("Paper")||thrown.equals("Scissors"))){
                    System.out.println("Not a valid response! (try 'Rock' 'Paper' or 'Scissors')");
                }
            } while(!(thrown.equals("Rock")||thrown.equals("Paper")||thrown.equals("Scissors")));

            switch (r.nextInt(3)){
                case 0:
                    memory[round-1] = (thrown.equals("Rock"))? 1: (thrown.equals("Scissors") ? 2 : 0);
                    System.out.println("Computer Threw ROCK!");     break;
                case 1:
                    memory[round-1] = (thrown.equals("Paper"))? 1: (thrown.equals("Rock") ? 2 : 0);
                    System.out.println("Computer Threw PAPER!");    break;
                case 2:
                    memory[round-1] = (thrown.equals("Scissors"))? 1: (thrown.equals("Paper") ? 2 : 0);
                    System.out.println("Computer Threw SCISSORS!"); break;
            }
            round++;
        }while(round <= games);
        System.out.print("Game Over...\n\nHere's the recap:\n");

        int g = 1;
        for (int x:memory){
            switch (x){
                case 0:
                    System.out.println("Player won Round "+g);      break;
                case 1:
                    System.out.println("Tied on Round "+g);         break;
                case 2:
                    System.out.println("Computer won Round "+g);    break;
            }
        }
    }
}
