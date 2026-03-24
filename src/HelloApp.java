/**
 * HelloApp.java - UC5: Display "Hello" with Multiple Command-Line Arguments
 *
 * This application accepts multiple names as command-line arguments
 * and displays a personalized greeting for each user using an enhanced
 * for loop. If no names are provided, it displays "Hello, World!".
 *
 * Usage:
 * java HelloApp [name1] [name2] ... [nameN]
 *
 * Examples:
 * java HelloApp
 * Output: Hello, World!
 *
 * java HelloApp Alice
 * Output: Hello, Alice!
 *
 * java HelloApp Alice Bob Charlie
 * Output: Hello, Alice, Bob, Charlie!
 *
 * @author Akshdeep Singh
 * @version 5.0
 * @since UC1
 */

/**
 * Key Concepts for HelloApp UC5:
 * 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
 * 2. Array Iteration: Using enhanced for loop to traverse all arguments
 * 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
 * 4. StringBuilder: Efficiently building a string in a loop without creating multiple immutable string objects
 * 5. Default Values: Providing a fallback when no arguments are provided
 * 6. String Concatenation: Building the final greeting message
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return; // Exit after printing default message
        }

        // Create StringBuilder to efficiently build the names string
        StringBuilder nameBuilder = new StringBuilder();

        // Boolean flag to handle comma placement
        boolean first = true;

        // Enhanced for loop to iterate through all command-line arguments
        for (String name : args) {

            // Add comma and space before every name except the first one
            if (!first) {
                nameBuilder.append(", ");
            }

            // Append current name
            nameBuilder.append(name);

            // Set first to false after first iteration
            first = false;
        }

        // Print the final greeting message
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}