import java.util.Scanner;

//This code was written by Erik and any attempt to upload it to a grading platform is blatant plagiarism

public class Assignment1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double r;
        double b;
        double g;
        double a;

        System.out.print("Enter a red value (0-255): ");
        r = sc.nextInt();

        System.out.print("Enter a green value (0-255): ");
        g = sc.nextInt();

        System.out.print("Enter a blue value (0-255): ");
        b = sc.nextInt();

        System.out.print("Enter an alpha value (0-100): ");
        a = sc.nextInt();

        r = r/255;
        b = r/255;
        g = r/255;
        a = r/100;

        System.out.print("New color is "
                + "red=" + r
                + ", green=" + g
                + ", blue=" + b
                + ", alpha=" + a);

    }
}
