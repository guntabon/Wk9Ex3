import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter");

        System.out.println("Enter the temperature: ");

        double temp = scanner.nextDouble();

        double celsius = (5.0/9.0) * (temp - 32);

        System.out.println(temp + "F degree is equivalent to " + celsius + " C");
    }
}