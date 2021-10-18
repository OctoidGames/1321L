import java.awt.*;
import java.util.*;

public class Lab9C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int c = sc.nextInt();
        int[ ][ ] grid = new int [r][c];
        int[ ] notgrid = new int [(r*c)];
        System.out.println(String.format("\nI have %d rows and %d columns. I need to fill-up %d spaces.\n", r, c, (r*c)));
        System.out.println(String.format("The %dx%d array:", r, c));

        int x=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                grid[i][j] = x;
                x++;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print(grid[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }

        x=0;
        for(int [] sml:grid){
            for(int smlr:sml){
                notgrid[x] = smlr;
                x++;
            }
        }

        System.out.print(String.format("\nThe %dx%d 2- D array flattened into a %d cell 1-D array:\n", r, c, (r*c)));
        for(int smlr:notgrid){
            System.out.print(smlr+"|");
        }
    }
}
