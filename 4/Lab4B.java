import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        String day;
        System.out.print("Enter the day: ");
        day = sc.next();

        if (day.equals ("Monday") || day.equals ("monday") ||
                day.equals ("Wednesday") || day.equals ("wednesday")) {
            System.out.print("I have class today!");
        }
        else if (day.equals ("Friday") || day.equals ("friday")){
            System.out.print("It's Friday! Friday! Gotta get down on Friday!");
        }
        else {
            System.out.print("I should use this time to do my homework.");
        }
    }
}