public class Main {
    public static void main (String []args) {
    ConsoleInputOutput io = new ConsoleInputOutput();
    DanceCommand dance = new DanceCommand();

    while(true) {
        io.printPrompt(">");
        var input = io.readInput();

        if(dance.getValid(input)) {
             dance.execute(input);
        }else {
            io.displayText(input);
        }
    }
    }
}
