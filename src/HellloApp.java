/**
 * HelloApp.java - A simple Java application that displays "Hello World"
 * and optionally greets a user by name using command-line arguments.
 *
 * UC 1: Display "Hello World" - The application should display the message
 * "Hello World" to the console when executed without arguments.
 *
 * UC 2: Display User Name - The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 *
 * @author Akshdeep Singh
 * @version 2.0
 * @since UC1
 */

public class HellloApp {
    
    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } 
        else {
            System.out.println("Hello, World!");
        }

    }

}
