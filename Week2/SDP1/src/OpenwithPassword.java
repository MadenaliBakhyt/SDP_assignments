import java.util.Objects;

public class OpenwithPassword implements OpenType{
    public void open(LockType lt){
        if (lt.isPassword()){
            System.out.println("Open with password");
        }
        else {
            System.out.println("You can not open the door with password");
        }

    }
}
