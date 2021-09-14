import java.util.*;

public class Lab5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num;
        num = sc.nextInt();
        Boolean dun = false;

        for(int i = 2; i<6; i++){
            if(num%i == 0 && i != 4 && !dun){
                System.out.print("This number is divisible by " + i);
                dun = true;
            }
        }
        if(!dun){
            System.out.print("This number is undetermined");
        }
    }
}
