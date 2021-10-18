import java.util.*;

public class Lab9B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Please enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int c = sc.nextInt();
        int[ ][ ] grid = new int [r][c];
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
        
        int sum = 0;
        for (int[] sml : grid) {
            sum+= Arrays.stream(sml).sum();
        }

        System.out.println(String.format("The sum of all the numbers in the %dx%d array: %d", r, c, sum));
        System.out.println(String.format("The average of all the numbers in the %dx%d array: %.1f", r, c, (sum/((float)r*c))));
    }
}
