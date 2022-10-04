public class OpenwithKey implements OpenType {
    public void open(LockType lt){
        if (lt.isKey()){
            System.out.println("Open with key");
        }
        else {
            System.out.println("You can not open the door with key");
        }

    }
}
