import java.util.*;

public class Assignment5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[FYE Level Map Creator]");

        System.out.print("Enter a level map width: ");  int w = sc.nextInt();
        System.out.print("Enter a level map height: "); int h = sc.nextInt();
        String[][] map = new String[h][w];
        for(int i = 0; i < h; i++) {
            Arrays.fill(map[i], "*");
        }
        for(String[] i: map){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }

        int choice;
        do {
            System.out.print("\nOptions\n1. Clear Level\n2. Add Platform\n3. Add Items\n4. Quit\nEnter a choice: ");
            choice = sc.nextInt();
            System.out.print("\n");

            switch (choice) {
                case 1:
                    System.out.println("[Clear Level]");
                    for (int i = 0; i < h; i++) {
                        Arrays.fill(map[i], "*");
                    }
                    break;
                case 2:
                    System.out.println("[Add Platform]");
                    System.out.print("Enter X cordinate: "); int Xcord = sc.nextInt();
                    System.out.print("Enter Y cordinate: "); int Ycord = sc.nextInt();
                    System.out.print("Enter Length: "); int Length = sc.nextInt();
                    if (w-Length-Xcord+1 < 0){
                        System.out.println("This platform won’t fit in the level!");
                    }
                    else{
                        for(int i = 0; i < h; i++){
                            if (i == Ycord){
                                for(int j = 0; j < w; j++){
                                    if (j >= Xcord && j < Ycord+Length){
                                        map[i][j] = "=";
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("[Add item]");
                    System.out.print("Enter X cordinate: "); int xcord = sc.nextInt();
                    System.out.print("Enter Y cordinate: "); int ycord = sc.nextInt();

                    for(int i = 0; i < h; i++){
                        if (i == ycord){
                            for(int j = 0; j < w; j++){
                                if (j == xcord){
                                    map[i][j] = "O";
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.print("[Display Map]");
            }

            for(String[] i: map){
                for(String j: i){
                    System.out.print(j);
                }
                System.out.println();
            }
        } while (choice != 4);
        System.out.println("\n Goodbye!");
    }
}