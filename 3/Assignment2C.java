import java.util.Scanner;

//Welcome to Bisonica!
//How many US Dollars do you have? 10
//10 US Dollar(s) is 7.3 British Pound(s),
//which is 1.46 Bison Dollar(s)!

public class Assignment2C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final float USDtoGBP = 0.73f; //exchange rate
        final float GBPtoBison = 0.2f; //exchange rate

        float USD;
        float GBP;
        float Bison;

        System.out.println("Welcome to Bisonica!");
        System.out.print("How many US Dollars do you have? ");
        USD = sc.nextInt();

        GBP = USD * USDtoGBP;
        Bison = GBP * GBPtoBison;

        System.out.println(USD + " US Dollar(s) is " + GBP + " British Pound(s),");

        System.out.print("which is " + Bison + " Bison Dollar(s)!");
    }
}
