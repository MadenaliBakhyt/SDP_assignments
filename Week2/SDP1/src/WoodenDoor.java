public class WoodenDoor extends Door{
    public WoodenDoor(String door_name) {
        openType=new OpenwithKey();
        lockType=new Lockwithkey();
        this.door_name=door_name;
    }
}
