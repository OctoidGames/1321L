import java.util.*;

public class Lab5A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you have a driving permit (Y/N)? ");
        String permit;
        permit = sc.next();
        if(permit.equals("N")){
            System.out.print("Driving is a prerequisite to purchase a vehicle!");
        }
        else{
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            String com;
            com=sc.next();
            if(com.equals("N")){
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
            else{
                System.out.print("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
        }

    }
}

