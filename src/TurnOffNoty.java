public class TurnOffNoty implements Command{

    private Noty noty;

    public TurnOffNoty(Noty noty){
        this.noty = noty;
    }

    public void action(){
        noty.turnOff();
    }

}
