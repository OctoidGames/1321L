import java.util.Scanner;

//Enter the weekly subscription fee: 10
//Enter the number of customers: 50
//This company makes $500 each week.
//This company makes $26000 each year.

//This code was written by Erik and any attempt to upload it to a grading platform is blatant plagiarism


public class Assignment1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fee;
        int customers;
        int weekly;
        int yearly;

        System.out.print("Enter the weekly subscription fee: ");
        fee = sc.nextInt();

        System.out.print("Enter the number of customers: ");
        customers = sc.nextInt();

        weekly = fee * customers;
        yearly = weekly * 52;

        System.out.println("This company makes $" + weekly + " each week.");
        System.out.println("This Company makes $" + yearly + " each year.");

    }
}