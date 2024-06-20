public class TurnOnNoty implements Command{

    private Noty noty;

    public TurnOnNoty(Noty noty){
        this.noty = noty;
    }

    @Override
    public void action(){
        noty.turnOn();
    }
}
