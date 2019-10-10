import java.util.Scanner;

public class ConsoleInputOutput {
    Scanner scanner = new Scanner(System.in);
    public String readInput(){
        return scanner.nextLine();
    }

    public void printPrompt(String input){
        System.out.print(input);
    }

    public void displayText (String input) {
        System.out.println(input);
    }
}