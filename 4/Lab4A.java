import java.util.*;

public class Lab4A {
    public static void main (String[] args){

        double num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");
        num = Math.floor(sc.nextFloat() + 0.5f);

        Map<Integer, String> dict = new HashMap<Integer, String>();
        dict.put(64, "F"); dict.put(67, "D-"); dict.put(70, "D");dict.put(73, "D+");dict.put(76, "C-");dict.put(79, "C");dict.put(82, "C+");dict.put(85, "B-");dict.put(88, "B");dict.put(91, "B+");dict.put(94, "A-");dict.put(97, "A");dict.put(100, "A+");

        List<Integer> l = new ArrayList<Integer>(dict.keySet());
        Collections.sort(l);

        boolean huh = true;
        int i = 0;
        while (i < l.size()) {
            if (num <= l.get(i) && huh){
                System.out.print("Letter grade is: "+dict.get(l.get(i)));
                huh = false;
            }
            i++;
        }
    }
}
