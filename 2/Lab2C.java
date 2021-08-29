import java.util.Scanner;

//This code was written by Erik and any attempt to upload it to a grading platform is blatant plagiarism

public class Lab2C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int W;
        int H;
        W = sc.nextInt();
        System.out.print("Enter a height: ");
        H = sc.nextInt();

        int A;
        int P;
        A = W*H;
        P = W+W+H+H;

        System.out.print("The area is ");
        System.out.println(String.valueOf(A));

        System.out.print("The perimeter is ");
        System.out.println(String.valueOf(P));

    }
}
