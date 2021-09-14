import java.util.*;

public class Lab5C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("enter x: ");
        x = sc.nextInt();
        System.out.print("enter y: ");
        y = sc.nextInt();

        if(x>0){ x=2; }else if(x==0) { x = 1; } else{ x=0; } //turns each x and y into a usable int
        if(y>0){ y=2; }else if(y==0) { y = 1; } else{ y=0; }

        switch ((x*10)+y){
            case 22:
                System.out.print("This point is in the first quadrant.");
                break;
            case 21:
                System.out.print("This point is on the x axis.");
                break;
            case 20:
                System.out.print("This point is in the fourth quadrant.");
                break;
            case 12:
                System.out.print("This point is on the Y axis.");
                break;
            case 11:
                System.out.print("This point is at the origin.");
                break;
            case 10:
                System.out.print("This point is on the Y axis.");
                break;
            case 02:
                System.out.print("This point is in the second quadrant.");
                break;
            case 01:
                System.out.print("This point is on the x axis.");
                break;
            case 00:
                System.out.print("This point is in the third quadrant.");
                break;
        }
    }
}
