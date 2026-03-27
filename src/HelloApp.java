/**
 * HelloApp – UC7 – A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method,
 * or defaults to greeting "World" if no names are provided.
 *
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message – The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user using the String.join()
 * method. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Akshdeep Singh
 * @version 7.0
 * @since UC1
 */

// Key Concepts for HelloApp UC7:
// 1. String.join() Method: A built-in method to concatenate strings with a delimiter
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. Code Simplification: Reducing code complexity using built-in methods
// 7. Readability and Maintainability: Writing cleaner code with fewer lines

// Sample Code for HelloApp UC7:
// String names = "World";
// if (args.length > 0) {
//     names = String.join(", ", args);
// }

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String names = "World";

        // If arguments are provided, join them with ", "
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}