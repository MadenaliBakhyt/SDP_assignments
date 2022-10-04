public class Lockwithkey implements LockType{
    public boolean isKey(){
        return true;
    }
    public boolean isPassword(){
        return false;
    }

    @Override
    public void lock() {
        System.out.println("Locking with key");
    }
}
