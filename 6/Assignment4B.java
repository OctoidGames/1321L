import java.util.*;

public class Assignment4B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the diamond’s width: ");
        int w = sc.nextInt();
        if (w < 3){
            do{
                System.out.print("Please enter a width of at least 3");
                w = sc.nextInt();
            }
            while(w<3);
        }
        if(w%2!=1){
            w+=1;
            System.out.println("To make a diamond, we'll use "+w+" as the width instead.");
        }

        for(int i = 1; i <= w; i++){
            for(int j = 1; j <= w; j++){
                if (i <= (w+1)/2) {
                    if (j - 1 < ((w + 1) / 2) - i) {
                        System.out.print(" ");
                    } else if (j > ((w + 1) / 2) - i && j < ((w + 1) / 2) + i) {
                        System.out.print("*");
                    }
                }
                else{
                    if(i-w/2 > j) {
                        System.out.print(" ");
                    }else if(j-1 < w*1.5-i){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
