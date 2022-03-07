import java.util.Scanner;
public class no9temperatures { 
    public static void main(String[] Strings) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a degree Celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit =((celsius * 9/5) + 32);
            System.out.println(celsius + " degree Celcius is equal to " + fahrenheit + " in Fahrenheit.");
        }

    }
}