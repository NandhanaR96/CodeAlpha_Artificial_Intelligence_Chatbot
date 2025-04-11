import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    private Map<String, String> responses;

    public Chatbot() {
        this.responses = new HashMap<>();
        this.responses.put("hello", "Hi! How are you today?");
        this.responses.put("fine,how are you", "I'm good, thanks!");
        this.responses.put("what is your name", "My name is Chatbot!");
        this.responses.put("exit", "Goodbye! It was nice chatting with you.");
    }

    public void chat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the chatbot! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Chatbot: " + responses.get("exit"));
                break;
            }

            if (responses.containsKey(input)) {
                System.out.println("Chatbot: " + responses.get(input));
            } else {
                System.out.println("Chatbot: Sorry, I didn't understand that.");
            }
        }
    }

    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        chatbot.chat();
    }
}
