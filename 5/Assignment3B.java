import java.util.*;

public class Assignment3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What month of the year is it?: ");
        int m;
        Boolean leap = false;

        m = sc.nextInt();

        Map<Integer, String> Months = new HashMap<Integer, String>();
        Months.put(1, "January"); Months.put(2, "Febuary"); Months.put(3, "March");Months.put(4, "April");Months.put(5, "May");Months.put(6, "June");Months.put(7, "July");Months.put(8, "August");Months.put(9, "September");Months.put(10, "October");Months.put(11, "November");Months.put(12, "Decmeber");

        Map<Integer, String> Days = new HashMap<Integer, String>();
        Days.put(1, "31"); Days.put(2, "28"); Days.put(3, "31");Days.put(4, "30");Days.put(5, "31");Days.put(6, "30");Days.put(7, "31");Days.put(8, "31");Days.put(0, "30");Days.put(10, "31");Days.put(11, "30");Days.put(12, "31");

        System.out.println("That is the month of "+Months.get(m)+".");
        if(!(m==2)){
            System.out.println("That month has "+Days.get(m)+" days in it!");
        }
        else {
            System.out.print("What year is it?: ");
            if((sc.nextInt() % 4 == 0)){
                System.out.print("In a leap year, that month has 29 days in it!");
            }
            else{
                System.out.print("In a normal year, that month has 28 days in it!");
            }
        }
    }
}