import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the base number.");
        String line = myObj.nextLine();
        int base = Integer.valueOf(line);
        for(int x = 0; x < base; x++){
            for(int y = 0; y < x; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        myObj.close();
    }
}