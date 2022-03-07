import java.util.Scanner;
public class no10statistics { 
    public static void main(String[] Strings) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("please input your first number: ");
            double x1 = input.nextDouble();

            System.out.print("please input your second number: ");
            double x2 = input.nextDouble();

            System.out.print("please input your last number: ");
            double x3 = input.nextDouble();

            double mean =((x1 + x2 + x3) / 3);
            System.out.println("The mean of the data is: " + mean);

            double variance =(((x1 - mean) * (x1 - mean)) + ((x2 - mean) * (x2 - mean)) + ((x3 - mean) * (x3 - mean))) / 3; 
            System.out.println("The variance of the data is: " + variance);

            double deviation = Math.sqrt(variance);
	        System.out.println("The standard deviation is: " + deviation);
        }

    }
}