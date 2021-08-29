import java.util.Scanner;

//Enter the name of the street you live on: Lexington
//Enter the name of your favorite color: Red
//Enter the name of your favorite food: Apple
//Your stage name is Apple Red Lexington!
//This code was written by Erik and any attempt to upload it to a grading platform is blatant plagiarism

public class Assignment1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String street;
        String color;
        String food;

        System.out.print("Enter the name of the street you live on: ");
        street = sc.nextLine();

        System.out.print("Enter the name of your favorite color: ");
        color = sc.nextLine();

        System.out.print("Enter the name of your favorite food: ");
        food = sc.nextLine();

        System.out.print("Your stage name is " + food + " " + color + " " + street + "!");
    }
}