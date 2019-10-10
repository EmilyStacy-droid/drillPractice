public class DanceCommand {

    ConsoleInputOutput io = new ConsoleInputOutput();

    public boolean getValid(String input) {
        if (input.equalsIgnoreCase("dance")){
            return true;
        }else {
            return false;
        }
    }

    public void execute (String input) {
        io.displayText("You dance crazy");
    }
}
