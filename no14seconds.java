import java.util.Scanner;  
public class no14seconds {
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input the amount of seconds to convert: ");
            int seconds = input.nextInt(); 
            int p1 = seconds % 60;
            int p2 = seconds / 60;
            int p3 = p2 % 60;
            p2 = p2 / 60;
            System.out.print(seconds + " seconds are " + p2 + " hour, " + p3 + " minutes, and " + p1 + " seconds.");
        }
        System.out.print("\n");
    }   
}