public class Main {
    public static void main(String[] args) {
        OnlineShop os=new OnlineShop();
        Messager cs1=new Messager("Baha");
        Messager cs2=new Messager("Ali");
        Messager cs3=new Messager("Dan");

        os.registerObserver(cs1);
        os.registerObserver(cs2);
        os.registerObserver(cs3);
        
        os.newProduct("Iphone");
        os.newProduct("Macbook");

    }

}



