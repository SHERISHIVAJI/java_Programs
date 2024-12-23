package core.inheritance;
import java.util.*;

class User {
    String username;
    String password;

    // Constructor to initialize user data
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class FlipkartApp {
    // Map to store users' data (username -> User object)
    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Flipkart App");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (option) {
                case 1:
                    // Registration
                    registerUser(scanner);
                    break;
                case 2:
                    // Login
                    loginUser(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // Register new user
    private static void registerUser(Scanner scanner) {
        System.out.println("=== User Registration ===");
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (users.containsKey(username)) {
            System.out.println("Username already exists! Please try a different one.");
            return;
        }

        System.out.print("Enter a new password: ");
        String password = scanner.nextLine();

        // Create a new User object and add to the users map
        User newUser = new User(username, password);
        users.put(username, newUser);
        
        System.out.println("Registration successful! You can now log in.");
    }

    // Login with existing user
    private static void loginUser(Scanner scanner) {
        System.out.println("=== User Login ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Authenticate user
        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Authenticate user credentials
    private static boolean authenticate(String username, String password) {
        // Check if the username exists in the map
        User user = users.get(username);
        return user != null && user.password.equals(password);
    }
}
