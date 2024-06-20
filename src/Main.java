//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Noty noty = new Noty();

        Command turnOnNoty = new TurnOnNoty(noty);
        Command turnOffNoty = new TurnOffNoty(noty);

        Remote remote = new Remote();

        remote.setCommand(turnOnNoty);
        remote.clickButton();

        remote.setCommand(turnOffNoty);
        remote.clickButton();

        }
    }