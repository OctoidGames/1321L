import java.util.*;

public class Assignment3A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer;
        int dolls = 0;
        double cost;

        System.out.print("Do you want to purchase Scrappy dolls?: ");
        answer=sc.next();
        if(answer.equals("Yes")){
            System.out.print("How many Scrappy dolls do you want to buy?: ");
            dolls = sc.nextInt();
        }
        if(dolls > 5){
            System.out.println("You earned a 10% discount for buying in bulk!");
        }
        cost=(dolls*1.8)+(((dolls>5)?0:1)*0.2*dolls);
        if(!(dolls == 0)){
            System.out.println(String.format(dolls + " Scrappy dolls cost $%.2f. Thank you!", cost));
        }

        System.out.print("Have a nice day!");
    }
}
