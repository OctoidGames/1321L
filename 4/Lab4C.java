import java.util.*;

public class Lab4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        float input;
        float output;

        input = sc.nextFloat();
        System.out.println();
        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
        System.out.println();

        int option;
        option = sc.nextInt();
        System.out.println();
        switch(option){
            case 0:
                if(input <= 0){
                    output = Math.abs(input);
                }
                else{
                    output = 0-input;
                }
                System.out.print("The additive inverse of "+input+" is "+output);
                break;
            case 1:
                System.out.println("The reciprocal of "+input+" is "+(1/input));
                break;
            case 2:
                System.out.println("The square of "+input+" is "+(input*input));
                break;
            case 3:
                System.out.println("The cube of "+input+" is "+(input*input*input));
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");
        }
    }
}
