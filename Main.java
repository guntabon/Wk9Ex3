import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //This line creates a scanner for user input later
        Scanner scanner = new Scanner(System.in);

        //This line welcomes the user to the application
        System.out.println("Welcome to Temperature Converter");

        //This line prompts the user to enter the temperature
        System.out.println("Enter the temperature: ");

        //This line creates the temp double and assigns it the user entered value
        double temp = scanner.nextDouble();

        //This line creates the celsius double and assigns it to the value of temp -32 * 5/9
        double celsius = (5.0/9.0) * (temp - 32);

        //THis line prints out the temperature and its equivalent celsius output
        System.out.println(temp + "F degree is equivalent to " + celsius + " C");
    }
}