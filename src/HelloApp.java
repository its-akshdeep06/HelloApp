/**
 * HelloApp.java - A simple Java application that greets the user by name. 
 * If no name is given, it greets "World". This demonstrates how to handle 
 * optional command-line arguments in Java.
 * 
 * UC3 Hello.java Code Snippet
 */

/**
 * Author: Akshdeep Singh
 * Version: 3.0  
 * Since: UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name="World"
        String name = "World";  
        
        /**
         * 1. Default Values: Providing fallback value when no input is given
         * 2. Boolean Logic: Using conditions to control program flow
         * 3. Array Length: Checking the number of command-line arguments
         * 
         * If name is provided as command-line argument, use the provided name
         */
        if (args.length > 0) {
            name = args[0];
        }
        
        System.out.println("Hello, " + name + "!");
    }
}
