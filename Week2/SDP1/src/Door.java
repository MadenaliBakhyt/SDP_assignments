public class Door {
    String door_name;
    OpenType openType;
    LockType lockType;

    public Door() {
        this.openType = new OpenwithPassword();
        this.lockType = new LockwithPassword();
    }

    public void trylock(){
        lockType.lock();
    }
    public void tryopen(){
        openType.open(this.lockType);
    }

    public String getDoor_name() {
        return door_name;
    }

    public void setDoor_name(String door_name) {
        this.door_name = door_name;
    }

    public void setOpenType(OpenType openType) {
        this.openType = openType;
    }

    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }
}
