public class Remote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void clickButton(){
        command.action();
    }
}
