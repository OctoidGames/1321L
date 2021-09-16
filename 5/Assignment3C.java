import java.awt.desktop.SystemEventListener;
import java.util.*;

public class Assignment3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String setting;
        float dues;
        int total;
        String mes = "";

        System.out.print("Do you want an indoor or outdoor club?: ");
        setting = sc.next();
        System.out.print("How much are you willing to pay in dues?: ");
        dues = sc.nextFloat();

        total = (setting.equals("Indoor")? 1:0)*10 + (setting.equals("Outdoor")? 2:0)*10 + ((dues >= 5)? 1:0);
        switch(total){ //doesn't this look much better than some stinky if else trees?
            case 00:
                mes = "Sorry, that’s not a valid option.";
                break;
            case 01:
                mes = "Sorry, that’s not a valid option.";
                break;
            case 10:
                mes = "You could join the Chess club!";
                break;
            case 11:
                mes = "You could join the Virtual Reality club!";
                break;
            case 20:
                mes = "You could join the Running club!";
                break;
            case 21:
                mes = "You could join the Medieval Combat Sports club!";
                break;
        }
        System.out.print(mes);
    }
}
