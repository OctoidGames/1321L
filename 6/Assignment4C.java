import java.awt.*;
import java.util.*;

public class Assignment4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random coin = new Random();
        System.out.print("How many times do you want to flip the coin?: ");
        int flips = sc.nextInt();
        int heads = 0;

        for(int i = 1; i <= flips; i++){
            heads += coin.nextInt(2);
        }

        System.out.println("After flipping the coin "+flips+" time(s), we found that it lands on:");
        System.out.println("Heads - " + heads + " times (" + ((float)heads/flips)*100 + "%)");
        System.out.println("Tails - " + (flips-heads) + " times (" + ((float)(flips-heads)/flips)*100 + "%)");
        if(heads>flips-heads){
            System.out.println("The coin lands on heads more often than tails!");
        }else if(heads==flips-heads){
            System.out.println("The coin is perfectly fair!");
        }else{
            System.out.println("The coin lands on tails more often than heads!");
        }
    }
}
