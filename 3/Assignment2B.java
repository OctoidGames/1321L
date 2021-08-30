import java.util.Scanner;

//Enter the hit box top-left X coordinate: 0
//Enter the hit box top-left Y coordinate: 7
//Enter the width of the hit box: 4
//Enter the height of the hit box: 7
//[Hit Box Coordinates]
//Top-Left: 0, 7
//Bottom-Left: 0, 0
//Top-Right: 4, 7
//Bottom-Right: 4, 0

public class Assignment2B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int TLX;
        int TLY;
        int H;
        int W;

        System.out.print("Enter the hit box top-left X coordinate: ");
        TLX = sc.nextInt();

        System.out.print("Enter the hit box top-left Y coordinate: ");
        TLY = sc.nextInt();

        System.out.print("Enter the width of the hit box: ");
        W = sc.nextInt();

        System.out.print("Enter the height of the hit box: ");
        H = sc.nextInt();

        System.out.println("Top-Left: "+TLX+", "+TLY);
        System.out.println("Bottom-Left: "+TLX+", "+(TLY-H));
        System.out.println("Top-Right: "+(TLX+W)+", "+TLY);
        System.out.println("Bottom-Right: "+(TLX+W)+", "+(TLY-H));
    }
}
