public class MetalDoor extends Door{
    public MetalDoor(String door_name) {
        openType=new OpenwithPassword();
        lockType=new LockwithPassword();
        this.door_name=door_name;
    }
}
