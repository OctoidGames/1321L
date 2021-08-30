import java.util.Scanner;

//How much time has passed (in seconds)?: 3661
//Now converting...
//3661 seconds is 1 hour(s), 1 minute(s), and 1 second(s).

public class Lab3A {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int Input;

        int hours;
        int minutes;
        int seconds;

        System.out.print("How much time has passed (in seconds)?: ");
        Input = sc.nextInt();

        System.out.println("Now converting...");

        hours = Input / 3600; // divides by the 3600 seconds in an hour
        minutes = (Input / 60) % 60; // divides by the 60 seconds in a minute and cuts off the minutes in the hours
        seconds = Input % 60; // finds how many seconds were left over in the minute calculation

        System.out.print(Input + " seconds is " +
                hours + " hour(s), " +
                minutes  + " minute(s), and " +
                seconds + " second(s).");
    }
}
