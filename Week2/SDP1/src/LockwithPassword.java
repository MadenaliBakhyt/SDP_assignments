public class LockwithPassword implements LockType{
    public boolean isPassword(){
        return true;
    }
    public boolean isKey(){
        return false;
    }
    @Override
    public void lock() {
        System.out.println("Locking by password");
    }
}
