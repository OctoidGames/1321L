import java.util.*;

public class Assignment5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What’s the highest number you want to generate?: ");
        int h = sc.nextInt();
        System.out.print("How long of a number sequence do you want to generate?: ");
        int l = sc.nextInt();
        System.out.print("Okay, we’ll generate "+l+" number(s) ranging from 1 to "+h+"!\n");
        Random r = new Random();
        int [] a = new int [l];
        for(int x=0;x<l;x++){
            a[x]=r.nextInt(h)+1;
        }
        for(int x:a) {
            System.out.print(x + ", ");
        }
        System.out.print("\nFrequency:\n");
        for(int g = 1; g<=h; g++){
            System.out.print(g);
            System.out.print(" occurs ");
            int n = 0;
            for(int f:a){
                if(f==g){
                    n++;
                }
            }
            System.out.print(String.format("%.2f", (float)n/l*100));
            System.out.print("% of the time\n");
        }

    }
}
