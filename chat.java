package chat_bot;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I help you today?");
        
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            String response = generateResponse(userInput);
            System.out.println("Chatbot: " + response);
        }
        scanner.close();
    }

    private static String generateResponse(String input) {
        // Simple response logic
        if (input.contains("hi") || input.contains("hello"))
{
            return "Hello! How can I assist you?";
        } else if (input.contains("help")) {
            return "Sure! What do you need help with?";
        } else {
            return "I'm not sure how to respond to that.";
        }
    }
}

