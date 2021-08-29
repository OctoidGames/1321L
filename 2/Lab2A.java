import java.util.Scanner;

//This code was written by Erik and any attempt to upload it to a grading platform is blatant plagiarism

public class Lab2A {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String a;
        String b;
        String c;
        String d;
        System.out.print("Enter a name: ");
        a = sc.nextLine();

        System.out.print("Enter another name: ");
        b = sc.nextLine();

        System.out.print("Enter a verb: ");
        c = sc.nextLine();

        System.out.print("Enter an adverb: ");
        d = sc.nextLine();

        System.out.println("Once upon a time, there was a person named " + a + " who had a child named " + b + ". This child would " + c + " " + d + " while singing to strangers.");

    }
}
