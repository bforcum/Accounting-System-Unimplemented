import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome Smart Banking System!");

        boolean running = true;
        int balance = 100;
        while (running) {

            System.out.println("""
                    Enter 1 to deposit, 2 to withdraw,
                    3 to view balance, and 4 to exit
                    """);
            String input = myScanner.nextLine();
            if (input.equals("1")) {
                // Print something asking the user how much they want to deposit
                // Get a number to deposit
                // Check if it is negative
                // if so, say "Invalid Amount"
                // Otherwise, add it to the balance                

            } else if (input.equals("2")) {
                // Print something asking the user how much they want to withdraw
                // Get a number to withdraw
                // Check if it is negative
                // if so, say "Invalid Amount" and exit
                // Check if withdrawing the requested amount would result in negative balance;
                // If so, say "Insufficient Funds" and exit
                // Otherwise, subtract from the balance and print "here is X amount of money"
                
            } else if (input.equals("3")) {
                // Print "Your balance is [insert balance here]
                
                System.out.println("Your balance is $" + String.valueOf(balance));
            } else if (input.equals("4")) {
                // Exit the loop

            }
        }
        
    }
}
